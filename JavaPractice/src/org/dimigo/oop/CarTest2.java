/**
 * 
 */
package org.dimigo.oop;

/**
 * <pre>
 * org.dimigo.oop
 *   └CarTest2
 *
 * 1. 개요 : 
 * 2. 작성일 : 2015. 4. 14.
 * </pre>
 *
 * @author 		: 김우범
 * @version 	: 1.1
 */
public class CarTest2 {
public static void main(String[] args) {
		
		// Declaration
		
		Car2 car1 = new Car2("현대자동차", "제네시스", "검정색", 225, 50000000);
		Car2 car2 = new Car2("기아자동차", "K7", "흰색", 246, 40000000);
		Car2 car3 = new Car2("삼성자동차", "SM7", "회색", 200, 38000000);
		
		// Trash can
		
//		car1.SetCompany("현대자동차");
//		car1.SetModel("제네시스");
//		car1.SetColor("검정색");
//		car1.SetMaxSpeed(225);
//		car1.SetPrice(50000000);
//		
//		car2.SetCompany("기아자동차");
//		car2.SetModel("K7");
//		car2.SetColor("흰색");
//		car2.SetMaxSpeed(246);
//		car2.SetPrice(40000000);
//		
//		car3.SetCompany("삼성자동차");
//		car3.SetModel("SM7");
//		car3.SetColor("회색");
//		car3.SetMaxSpeed(200);
//		car3.SetPrice(38000000);
		
		
		// Output
		
		System.out.println("<< 자동차 목록 >>");
		
		// 1st
		System.out.println("제조사명 : " + car1.GetCompany());
		System.out.println("모델명 : " + car1.GetModel());
		System.out.println("색상 : " + car1.GetColor());
		System.out.println("최대속도 : " + car1.GetMaxSpeed() + "km");
		System.out.println("가격 : " + String.format("%,d", car1.GetPrice()) + "원");
		System.out.println("");
		
		// 2nd
		System.out.println("제조사명 : " + car2.GetCompany());
		System.out.println("모델명 : " + car2.GetModel());
		System.out.println("색상 : " + car2.GetColor());
		System.out.println("최대속도 : " + car2.GetMaxSpeed() + "km");
		System.out.println("가격 : " + String.format("%,d", car2.GetPrice()) + "원");
		System.out.println("");
		
		// 3rd
		System.out.println("제조사명 : " + car3.GetCompany());
		System.out.println("모델명 : " + car3.GetModel());
		System.out.println("색상 : " + car3.GetColor());
		System.out.println("최대속도 : " + car3.GetMaxSpeed() + "km");
		System.out.println("가격 : " + String.format("%,d", car3.GetPrice()) + "원");
	}
}
