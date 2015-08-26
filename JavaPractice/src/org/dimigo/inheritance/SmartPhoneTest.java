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
		
		SmartPhone[] phones = {
				new IPhone("iPhone 6", "애플", 700000),
				new Galaxy("갤럭시 S6", "삼성", 650000)
		};
		
		for(SmartPhone p : phones) {
			System.out.println(p);
			p.turnOn();
			p.pay();
			p.useSpecialFunction();
			p.turnOff();
			System.out.println();
		}
	}
}
