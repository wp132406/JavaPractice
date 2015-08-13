/**
 * 
 */
package org.dimigo.inheritance;

/**
 * <pre>
 * org.dimigo.inheritance
 *   └Triangle
 *
 * 1. 개요 : 
 * 2. 작성일 : 2015. 8. 12.
 * </pre>
 *
 * @author 		: 김우범
 * @version 	: 1.1
 */
public class Triangle extends Figure {
	
	private int width;
	private int height;
	
	public Triangle(int width, int height)
	{
		this(0, 0, width, height);
	}
	
	public Triangle(int centerX, int centerY, int width, int height)
	{
		super(centerX, centerY);
		this.width = width;
		this.height = height;
	}
	
	protected double calcArea()
	{
		return width * height * 0.5;
	}
}
