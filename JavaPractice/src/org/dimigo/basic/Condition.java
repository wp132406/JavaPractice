/**
 * 요금 계산 프로그램
 * 2015.3.23
 * @author 김우범
 * @version 1.1
 */


package org.dimigo.basic;

public class Condition {

	public static void main(String[] args) {
		
		int dist = 25;
		int total_fee = 0;
		String car_type = "";
		
		
		switch(car_type) {
		case "고속버스":
			total_fee += 850;
			total_fee += (dist/10) * 300;
			break;
			
		case "경차":
			total_fee += 300;
			total_fee += (dist/10) * 200;
			break;
			
		default:
			car_type = "그 외";
			total_fee += 600;
			total_fee += (dist/10) * 200;
			break;
		}
		

		System.out.println("<< 고속도로 통행료 계산 >>");
		
		System.out.println("거리 : " + dist + "km");
		System.out.println("차종 : " + car_type);
		System.out.println("통행료 : " + total_fee + "원");
	}
}
