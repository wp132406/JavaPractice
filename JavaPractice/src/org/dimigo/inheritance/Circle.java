/**
 * 
 */
package org.dimigo.inheritance;

/**
 * <pre>
 * org.dimigo.inheritance
 *   └Circle
 *
 * 1. 개요 : 
 * 2. 작성일 : 2015. 8. 12.
 * </pre>
 *
 * @author 		: 김우범
 * @version 	: 1.1
 */
public class Circle extends Figure {

	private int radius;
	
	public Circle(int radius) 
	{
		this(0, 0, radius);
	}
	
	public Circle(int centerX, int centerY, int radius) 
	{
		super(centerX, centerY);
		this.radius = radius;
	}
	
	protected double calcArea() 
	{
		return radius * radius * Math.PI;
	}
	
	protected void printCenter()
	{
		System.out.print("원 ");
		super.printCenter();
	}
}
