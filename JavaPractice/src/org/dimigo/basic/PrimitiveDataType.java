package org.dimigo.basic;
/**
 * << 첫번째 수행평가 과제 >>
 * 내용 : 아이유 프로필 출력
 * 작성일자 : 2015년 3월 13일
 * @version 1.0
 * @author 김우범
 */

public class PrimitiveDataType {
	public static void main(String[] args) {
		
		// Declaration
		
		String name = "아이유";
		
		boolean gender = true;
		
		int age = 23;
		
		double height = 161.8;
		
		float weight = 44.3f;
		
		char bloodtype = 'A';
		
		
		// Output
		
		System.out.println("<< 아이유 프로필 >>");
		
		System.out.println("이름 : " + name);
		
		System.out.printf("성별 : ");
		
		if(gender) System.out.println("여자");
		
		else System.out.println("남자");
		
		System.out.println("나이 : " + age + " 세");
		
		System.out.println("키 : " + height + " cm");
		
		System.out.println("몸무게 : " + weight + " kg");
		
		System.out.println("혈액형 : " + bloodtype + " 형");
	}
}
