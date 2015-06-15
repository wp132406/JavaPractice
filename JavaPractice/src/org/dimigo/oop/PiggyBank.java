/**
 * 
 */
package org.dimigo.oop;

/**
 * <pre>
 * org.dimigo.oop
 *   └PiggyBank
 *
 * 1. 개요 : 
 * 2. 작성일 : 2015. 6. 15.
 * </pre>
 *
 * @author 		: 김우범
 * @version 	: 1.0
 */
public class PiggyBank {
	
	private static int balance = 0;
	
	public static void putMoney(FamilyMember member, int amount)
	{
		System.out.println(member.getMemberName() + " " + amount + "원 넣음");
		balance += amount;
	}
	
	public static void printBalance()
	{
		System.out.println("\n돼지저금통 총 금액 : " + balance + "원\n");
	}
}
