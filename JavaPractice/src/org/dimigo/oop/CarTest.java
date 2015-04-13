/**
 * 
 */
package org.dimigo.oop;

/**
 * <pre>
 * org.dimigo.oop
 *   └CarTest
 *
 * 1. 개요 : 
 * 2. 작성일 : 2015. 4. 13.
 * </pre>
 *
 * @author 		: 김우범
 * @version 	: 1.0
 */
public class CarTest {

	public static void main(String[] args) {
		
		Car car1 = new Car();
		Car car2 = new Car();
		Car car3 = new Car();
		
		car1.SetCompany("현대자동차");
		car1.SetModel("제네시스");
		car1.SetColor("검정색");
		car1.SetMaxSpeed(225);
		car1.SetPrice(50000000);
		
		car2.SetCompany("기아자동차");
		car2.SetModel("K7");
		car2.SetColor("흰색");
		car2.SetMaxSpeed(246);
		car2.SetPrice(40000000);
		
		car3.SetCompany("삼성자동차");
		car3.SetModel("SM7");
		car3.SetColor("회색");
		car3.SetMaxSpeed(200);
		car3.SetPrice(38000000);
		
		
		
		System.out.println("<< 자동차 목록 >>");
		
		System.out.println("제조사명 : " + car1.GetCompany());
		System.out.println("모델명 : " + car1.GetModel());
		System.out.println("색상 : " + car1.GetColor());
		System.out.println("최대속도 : " + car1.GetMaxSpeed() + "km");
		System.out.println("가격 : " + String.format("%,d", car1.GetPrice()) + "원");
		
		System.out.println("");
		
		System.out.println("제조사명 : " + car2.GetCompany());
		System.out.println("모델명 : " + car2.GetModel());
		System.out.println("색상 : " + car2.GetColor());
		System.out.println("최대속도 : " + car2.GetMaxSpeed() + "km");
		System.out.println("가격 : " + String.format("%,d", car2.GetPrice()) + "원");
		
		System.out.println("");
		
		System.out.println("제조사명 : " + car2.GetCompany());
		System.out.println("모델명 : " + car2.GetModel());
		System.out.println("색상 : " + car2.GetColor());
		System.out.println("최대속도 : " + car2.GetMaxSpeed() + "km");
		System.out.println("가격 : " + String.format("%,d", car2.GetPrice()) + "원");
	}

}
