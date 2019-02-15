package cn.crazy.io;

import java.io.Serializable;

public class Person implements Serializable{

	private static final long serialVersionUID = -5460907458102726332L;
	private String name;
	private int age;
	private transient String job;
	
	public Person(String name,int age,String job){
		this.name = name;
		this.age = age;
		this.job = job;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", job=" + job + "]";
	}
	
	

}
