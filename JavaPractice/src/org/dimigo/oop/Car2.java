/**
 * 
 */
package org.dimigo.oop;

/**
 * <pre>
 * org.dimigo.oop
 *   └Car2
 *
 * 1. 개요 : 
 * 2. 작성일 : 2015. 4. 14.
 * </pre>
 *
 * @author 		: 김우범
 * @version 	: 1.1
 */
public class Car2 {
	
	// Declaration
	
	private String company;
	private String model;
	private String color;
	private int maxSpeed;
	private int price;
	
	
	// Constructor
	
	public Car2()	// 이건 일단 만들고 봅니다
	{ }
	
	public Car2(String newCompany, String newModel, String newColor, int newMaxSpeed, int newPrice)
	{
		company = newCompany;
		model = newModel;
		color = newColor;
		maxSpeed = newMaxSpeed;
		price = newPrice;
	}
	
	
	// Trash can

//	public void SetCompany(String com) {
//		company = com;
//	}
//	
//	public void SetModel(String mod) {
//		model = mod;
//	}
//	
//	public void SetColor(String clr) {
//		color = clr;
//	}
//
//	public void SetMaxSpeed(int speed) {
//		maxSpeed = speed;
//	}
//
//	public void SetPrice(int prc) {
//		price = prc;
//	}
	
	// Functions
	
	public String GetCompany() {
		return company;
	}

	public String GetModel() {
		return model;
	}
	
	public String GetColor() {
		return color;
	}
	
	public int GetMaxSpeed() {
		return maxSpeed;
	}
	
	public int GetPrice() {
		return price;
	}
}
