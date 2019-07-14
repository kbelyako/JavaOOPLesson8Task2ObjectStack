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
