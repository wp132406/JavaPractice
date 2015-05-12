/**
 * 
 */
package org.dimigo.oop;

import java.util.Scanner;

/**
 * <pre>
 * org.dimigo.oop
 *   └Score
 *
 * 1. 개요 : 
 * 2. 작성일 : 2015. 5. 12.
 * </pre>
 *
 * @author 		: 김우범
 * @version 	: 1.1
 */

public class Score {
	
	public static void main(String[] args) {
		
		
		// Declaration
		
		Scanner scan = new Scanner(System.in);
		
		int sub1, sub2, sub3;
		
		
		// Input
		
		System.out.print("국어 점수 입력 => ");
		sub1 = scan.nextInt();
		
		System.out.print("수학 점수 입력 => ");
		sub2 = scan.nextInt();
		
		System.out.print("영어 점수 입력 => ");
		sub3 = scan.nextInt();
		
		
		// Preparing...
		
		scan.close();
		
		System.out.println();
		StringBuilder sb = new StringBuilder();
		int total = sub1 + sub2 + sub3;
		
		
		// Chaining
		
		sb.append("국어 점수 : ").append(sub1 + "점\n")
			.append("수학 점수 : ").append(sub2 + "점\n")
			.append("영어 점수 : ").append(sub3 + "점\n")
			.append("총점 : ").append(total + "점\n")
			.append("평균 : ").append(String.format("%.1f", total/3.0) + "점");
				
		
		// Output
		
		System.out.println("<< 점수 출력 >>");
	
		System.out.println(sb);
	}
}
