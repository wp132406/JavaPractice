/**
 * 
 */
package org.dimigo.inheritance;

/**
 * <pre>
 * org.dimigo.inheritance
 *   └SmartPhoneTest
 *
 * 1. 개요 : 
 * 2. 작성일 : 2015. 8. 26.
 * </pre>
 *
 * @author 		: 김우범
 * @version 	: 1.0
 */
public class SmartPhoneTest {
	
	public static void main(String[] args) {
		
		SmartPhone iphone = new IPhone("iPhone 6", "애플", 700000);
		SmartPhone galaxy = new Galaxy("갤럭시 S6", "삼성", 650000);
		
		iphone.turnOn();
		iphone.pay();
		iphone.useSpecialFunction(iphone);
		iphone.turnOff();
		
		System.out.println();
		
		galaxy.turnOn();
		galaxy.pay();
		galaxy.useSpecialFunction(galaxy);
		galaxy.turnOff();
	}
}
