package org.dimigo.basic;

/**
 * << 두번째 수행평가 과제 >>
 * 내용 : 연간 인건비 계산
 * 작성일자 : 2015년 3월 17일
 * @version 1.0
 * @author 김우범
 */

public class Promotion {
	
	public static void main(String[] args) {
		
		int salary = 1700000;
		int member = 3;
		int store = 1500;
		
		long total_salary = (long)salary * (long)member * (long)store * 12;
		
		
		System.out.println("<< 디미베네 연간 인건비 >>");
		System.out.println("월 평균 급여 : " + String.format("%,d", salary)+ "원");
		System.out.println("점포 내 직원 수 : " + String.format("%,d", member) + "명");
		System.out.println("점포 수 : " + String.format("%,d", store) + "개\n");
		
		System.out.println("연간 인건비 : "
				+ String.format("%,d", total_salary) + "원");
	}
}
