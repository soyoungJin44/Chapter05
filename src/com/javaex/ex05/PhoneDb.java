package com.javaex.ex05;

public class PhoneDb {
	
	//필드
	private String name;
	private String hp;
	private String number;
	//생성자
	public PhoneDb() {
		super();
	}
	
	public PhoneDb(String name, String hp, String number) {
		this.name = name;
		this.hp = hp;
		this.number = number;
	}
	//메서드 gs

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getHp() {
		return hp;
	}

	public void setHp(String hp) {
		this.hp = hp;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	
	
	//메서드 일반
	@Override
	public String toString() {
		return "PhoneDb [name=" + name + ", hp=" + hp + ", number=" + number + "]";
	}
	
	public void showInfo() {
		System.out.println("---------------------");
		System.out.println("이름:" + name);
		System.out.println("폰번호:" + hp);
		System.out.println("전화번호" + number);
		System.out.println("---------------------");
	}
	
	
	

}
