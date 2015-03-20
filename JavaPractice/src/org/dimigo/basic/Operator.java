/**
 * 사다리꼴과 평행사변형 넓이 비교
 * 2015. 3. 20
 * @author 김우범
 * @version 1.0
 */
package org.dimigo.basic;

public class Operator {
	
	public static void main(String[] args) {
		
		int ladder_a = 9, ladder_b = 10;
		int par_a = 9;
		double ladder_h = 5.8;
		double par_h = 5.4;
		
		double ladder = ((ladder_a + ladder_b) * ladder_h) / 2;
		double par = par_a * par_h;
		
		System.out.println("<< 도형 넓이 비교 >>");
		System.out.println("사다리꼴 넓이 : " + ladder);
		System.out.println("평행사변형 넓이 : " + par + "\n");
		
		if(ladder > par) {
			System.out.println("사다리꼴이 평행사변형 보다 " + (ladder - par) + " 더 큽니다.");
		}
		
		else if(par > ladder) {
			System.out.println("평행사변형이 사다리꼴 보다 " + (par - ladder) + " 더 큽니다.");
		}
		
		else {
			System.out.println("둘이 같거나 알 수 없습니다.");
		}
	}
}
