/**
 * 
 */
package org.dimigo.oop;
import java.util.Scanner;
/**
 * <pre>
 * org.dimigo.oop
 *   └Question
 *
 * 1. 개요 : 
 * 2. 작성일 : 2015. 5. 11.
 * </pre>
 *
 * @author 		: 김우범
 * @version 	: 1.0
 */
public class Question {
	
	public static void main(String[] args) {
		
		// Declaration
		
		Scanner scan = new Scanner(System.in);
		String answer;
		
		// Question 1.
		
		System.out.println("프로그램 작성자가 동아리에서 배우고 있는 것은? (영어, 대소문자 구별 X, 띄어쓰기 X)");
		System.out.print(">> ");
		answer = scan.nextLine();
		
		if(answer.equalsIgnoreCase("directx"))
		{
			System.out.println("정답입니다.");
		}
		else
		{
			System.out.println("틀렸습니다.");
		}
		
		
		// Question 2.
		
		System.out.println("프로그램 작성자가 1번의 답을 배우기 위해 배우고 있던 것은? (조건은 위와 같음)");
		System.out.print(">> ");
		answer = scan.nextLine();
		
		if(answer.equalsIgnoreCase("c++"))
		{
			System.out.println("정답입니다.");
		}
		else
		{
			System.out.println("틀렸습니다.");
		}
		
		
		// Question 3.
		
		System.out.println("프로그램 작성자가 동아리 및 교내 교과와는 관련없이 배우고 싶어했던 언어는? (조건은 위와 같음)");
		System.out.print(">> ");
		answer = scan.nextLine();
		
		if(answer.equalsIgnoreCase("python"))
		{
			System.out.println("정답입니다.");
		}
		else
		{
			System.out.println("틀렸습니다.");
		}
		
		scan.close();
	}
}
