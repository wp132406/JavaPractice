/**
 * 
 */
package org.dimigo.oop;

/**
 * <pre>
 * org.dimigo.oop
 *   └Car3
 *
 * 1. 개요 : 
 * 2. 작성일 : 2015. 4. 14.
 * </pre>
 *
 * @author 		: 김우범
 * @version 	: 1.2
 */
public class Car3 {
	
	// Declaration
	
	private String company;
	private String model;
	private String color;
	private int maxSpeed;
	private int price;
	
	
	// Constructor
	
	public Car3(String company, String model, String color, int maxSpeed, int price)
	{
		this.company = company;
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
		this.price = price;
	}
	
	// Another Constructor
	
	public Car3(String company, String model, String color, int maxSpeed)
	{
		this(company, model, color, maxSpeed, 0);
	}
	
	
	public Car3(String company, String model, String color)
	{
		this(company, model, color, 0, 0);
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
