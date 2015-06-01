/**
 * 
 */
package org.dimigo.oop;

/**
 * <pre>
 * org.dimigo.oop
 *   └idolGroup
 *
 * 1. 개요 : 
 * 2. 작성일 : 2015. 6. 1.
 * </pre>
 *
 * @author 		: 김우범
 * @version 	: 1.0
 */
public class idolGroup {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] idolGroup = {"빅뱅", "Muse", "걸스데이"};
		
		String[][] members = {
				{"GD", "태양", "대성", "탑", "승리"},
				{"Matthew Bellamy", "Chris Wolstenholme", "Dominic Howard"},
				{"유라", "혜리", "소진", "민아"}
		};
		
		
		for(int i = 0; i < members.length; i++)
		{
			System.out.println("<< " + idolGroup[i] + " 멤버 >>");
			
			for(int j = 0; j < members[i].length; j++)
			{
				System.out.println(members[i][j]);
			}
			System.out.println();
		}
		
	}

}
