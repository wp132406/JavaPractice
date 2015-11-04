/**
 * 
 */
package org.dimigo.thread;

/**
 * <pre>
 * org.dimigo.thread
 *   └Race
 *
 * 1. 개요 : 
 * 2. 작성일 : 2015. 11. 4.
 * </pre>
 *
 * @author 		: 김우범
 * @version 	: 1.0
 */
public class Race {
	
	public static void main(String[] args) {
		
		System.out.println("main thread start");
		
		Runner r1 = new Runner("Mylo");
		Runner r2 = new Runner("Xyloto");
		
		r1.start();
		r2.start();
		
		System.out.println("main thread end");
	}
}
