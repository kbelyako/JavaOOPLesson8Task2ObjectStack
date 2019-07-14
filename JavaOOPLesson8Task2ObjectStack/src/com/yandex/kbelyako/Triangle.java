package com.yandex.kbelyako;

public class Triangle {
	private Double a;
	private Double b;
	private Double c;
	
	

	public Triangle(Double a, Double b, Double c) {
		super();
		this.a = a;
		this.b = b;
		this.c = c;
	}


	public Triangle() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Double getA() {
		return a;
	}


	public void setA(Double a) {
		this.a = a;
	}


	public Double getB() {
		return b;
	}


	public void setB(Double b) {
		this.b = b;
	}


	public Double getC() {
		return c;
	}


	public void setC(Double c) {
		this.c = c;
	}
	

	
	public void triangleSqure() {
		double p=(a+b+c)/2;
		double s=Math.sqrt(p*(p-a)*(p-b)*(p-c));
		System.out.println("Square of triangle:"+s);
	}


	@Override
	public String toString() {
		return "Triangle [a=" + a + ", b=" + b + ", c=" + c + "]";
	}
	
	
	
	
	
	
}