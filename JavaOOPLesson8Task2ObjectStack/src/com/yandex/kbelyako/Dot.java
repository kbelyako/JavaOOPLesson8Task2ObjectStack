package com.yandex.kbelyako;

public class Dot {

	private double x;
	private double y;

	public Dot(double x, double y) {
		super();
		this.x = x;
		this.y = y;
	}

	public Dot() {
		super();
	
	}

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}

	@Override
	public String toString() {
		return "Dot [x=" + x + ", y=" + y + "]";
	}

}