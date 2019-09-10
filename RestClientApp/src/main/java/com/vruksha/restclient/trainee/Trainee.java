package com.vruksha.restclient.trainee;




public class Trainee {


	int id;
	
	String tName;
	int age;

	public Trainee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Trainee(int id, String tName, int age) {
		super();
		this.id = id;
		this.tName = tName;
		this.age = age;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String gettName() {
		return tName;
	}
	public void settName(String tName) {
		this.tName = tName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Id= " + id + " \nName= " + tName + " \nAge= " + age ;
	}
	
	
	
	
}
