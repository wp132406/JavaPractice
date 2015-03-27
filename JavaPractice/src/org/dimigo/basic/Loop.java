/**
 * 별 찍는 프로그램
 * 2015. 3. 27
 * @author 김우범
 * @version 1.0
 */


package org.dimigo.basic;

public class Loop {
	
	public static void main(String[] args) {
		
		for(int i=1; i<=10; i++) {
			
			for(int j=1; j<=10; j++){
				
				if(j == i) System.out.print("*");
				else System.out.print(j);
			}
			
			System.out.println("");
		}
	}
}
