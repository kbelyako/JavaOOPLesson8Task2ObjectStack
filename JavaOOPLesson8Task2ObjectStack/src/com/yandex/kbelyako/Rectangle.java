package com.yandex.kbelyako;

public class Rectangle /*extends Shape*/ {
	private Dot a;
	private Dot b;
	private Dot c;
	private Dot d;

	public Rectangle(Dot a, Dot b, Dot c, Dot d) {
		super();
		this.a = a;
		this.b = b;
		this.c = c;
		this.d = d;
	}

	public Rectangle() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Dot getA() {
		return a;
	}

	public void setA(Dot a) {
		this.a = a;
	}

	public Dot getB() {
		return b;
	}

	public void setB(Dot b) {
		this.b = b;
	}

	public Dot getC() {
		return c;
	}

	public void setC(Dot c) {
		this.c = c;
	}

	public Dot getD() {
		return d;
	}

	public void setD(Dot d) {
		this.d = d;
	}

//	//@Override
//	double calculatePerimetr() {
//
//		/* Main dist = new Main(); */
//		/* Main.getDistance(a, b) */
//
//		double lAB = Main.getDistance(a, b);
//		double lBC = Main.getDistance(b, c);
//		double lCD = Main.getDistance(c, d);
//		double lDA = Main.getDistance(d, a);
//		double p = lAB + lBC + lCD + lDA;
//		return Main.round(p);
//	}
//
//	@Override
//	double calculateArea() {
//
//		double lAB = Main.getDistance(a, b);
//		double lBC = Main.getDistance(b, c);
//		double lCD = Main.getDistance(c, d);
//		double lDA = Main.getDistance(d, a);
//
//		double polP = (lAB + lBC + lCD + lDA) / 2;
//		double s = Math.sqrt((polP - lAB) * (polP - lBC) * (polP - lCD) * (polP - lDA));
//		return Main.round(s);
//	}

	@Override
	public String toString() {
		return "Rectangle [a=" + a + ", b=" + b + ", c=" + c + ", d=" + d  + "]";
	}

}