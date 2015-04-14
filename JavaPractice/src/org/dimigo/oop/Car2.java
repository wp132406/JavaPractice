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
 * @version 	: 1.0
 */
public class Car2 {
	
	// Declaration
	
	private String company;
	private String model;
	private String color;
	private int maxSpeed;
	private int price;
	
	
	// Constructor
	
	public Car2(String newCompany, String newModel, String newColor, int newMaxSpeed, int newPrice)
	{
		company = newCompany;
		model = newModel;
		color = newColor;
		maxSpeed = newMaxSpeed;
		price = newPrice;
	}
	
	
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
