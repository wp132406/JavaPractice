/**
 * 
 */
package org.dimigo.exception;

/**
 * <pre>
 * org.dimigo.exception
 *   └MovieTest
 *
 * 1. 개요 : 
 * 2. 작성일 : 2015. 9. 22.
 * </pre>
 *
 * @author 		: 김우범
 * @version 	: 1.1
 */
public class MovieTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Movie[] movies = {
				new Movie("베테랑", 15),
				new Movie("앤트맨", 12), 
				new Movie("사도", 12)
		};
		
		int age = 13;
		for (Movie movie : movies) {
			
			try {
				buyTicket(movie, age);
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
	}
	
	private static void buyTicket(Movie movie, int age) throws Exception
	{
		if(movie.getLimitAge() > age) {
			throw new AgeCheckException(movie);
		} else {
			System.out.println(movie.getTitle() + "(을)를 이용해주셔서 감사합니다.");
		}
	}

}
