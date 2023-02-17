package com.ThinkifyLabs.CabBookingApp.Entities;

public class Person {
	
	private String name;
	private char sex;
	private double age;
	private int x_coordinate;
	private int y_coordinate;
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public char getSex() {
		return sex;
	}
	
	public void setSex(char sex) {
		this.sex = sex;
	}
	
	public double getAge() {
		return age;
	}
	
	public void setAge(double age) {
		this.age = age;
	}

	public int getX_coordinate() {
		return x_coordinate;
	}

	public void setX_coordinate(int x_coordinate) {
		this.x_coordinate = x_coordinate;
	}

	public int getY_coordinate() {
		return y_coordinate;
	}

	public void setY_coordinate(int y_coordinate) {
		this.y_coordinate = y_coordinate;
	}
	
}
