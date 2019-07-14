//2) Создайте класс-контейнер типа стек (класс в который можно добавлять и удалять объекты других классов, только в вершину стека), в который можно сохранять объекты произвольного типа. Должен быть метод добавления элемента в стек, получение с удалением элемента из стека, и просто получение элемента из вершины из стека. 
//Должна быть реализована работа с «черным списком» классов (смотри ниже). Если объект который добавляется в стек принадлежит классу из «черного списка», то добавление такого объекта запрещено.
//3) Для описанного выше стека создайте класс «Черный список», в котором будут описаны классы объектов которые нельзя добавлять в стек. Должна быть возможность добавления классов в черный список, проверка объекта на то, что класс, к которому он принадлежит, принадлежит или не принадлежит к классам в черном списке.


package com.yandex.kbelyako;

public class Main {

	public static void main(String[] args) {
		Stack testStack = new Stack();

		Dot a = new Dot(0.0, 0.0);
		Dot b = new Dot(2.0, 0.0);
		Dot c = new Dot(2.0, 2.0);
		Dot d = new Dot(0.0, 2.0);

		Rectangle rectangle1 = new Rectangle(a, b, c, d);
		Triangle triangle1 = new Triangle(5.0, 3.0, 4.0);

		System.out.println(testStack.toString());

		testStack.addObject(rectangle1);
		testStack.addObject(a);

		System.out.println(testStack.toString());

		testStack.addClasstToBlackList(Triangle.class);

		testStack.addObject(triangle1);

		System.out.println(testStack.getObject());
		System.out.println(testStack.getObject());

		System.out.println(testStack.toString());

		testStack.rmvClassFromBlackList(Triangle.class);
		testStack.addObject(triangle1);

		System.out.println(testStack.toString());

	}

}
