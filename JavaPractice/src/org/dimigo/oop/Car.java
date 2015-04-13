/**
 * 
 */
package org.dimigo.oop;

/**
 * <pre>
 * org.dimigo.oop
 *   └Car
 *
 * 1. 개요 : 
 * 2. 작성일 : 2015. 4. 10.
 * </pre>
 *
 * @author 		: 김우범
 * @version 	: 1.0
 */
public class Car {
	
	// Declaration
	
	private String company;
	private String model;
	private String color;
	private int maxSpeed;
	private int price;
	
	
	// Functions
	
	public String GetCompany() {
		return company;
	}
	
	public void SetCompany(String com) {
		company = com;
	}
	
	
	
	public String GetModel() {
		return model;
	}
	
	public void SetModel(String mod) {
		model = mod;
	}
	
	
	
	public String GetColor() {
		return color;
	}
	
	public void SetColor(String clr) {
		color = clr;
	}
	
	
	
	public int GetMaxSpeed() {
		return maxSpeed;
	}
	
	public void SetMaxSpeed(int speed) {
		maxSpeed = speed;
	}
	
	
	
	public int GetPrice() {
		return price;
	}
	
	public void SetPrice(int prc) {
		price = prc;
	}
}
