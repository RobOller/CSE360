/*
 * Author Robert Oller
 * ClassID CSE 360 - Assignment 2

 * Description: To emulate a calculator using basic arithmetic.
 */
package cse360assign2;

public class Calculator 
{

	private int total;
	
	/**
	 * Description: Calculator constructor.
	 */
	public Calculator () 
	{
		total = 0;  // not needed - included for clarity
	}
	
	/**
	 * Description: To return the total.
	 * @return 0
	 */
	public int getTotal () 
	{
		return total;
	}
	
	/**
	 * Description: To add the given input.
	 * @param value
	 */
	public void add (int value) 
	{
		total += value;
	}
	
	/**
	 * Description: To subtract the given input.
	 * @param value
	 */
	public void subtract (int value) 
	{
		total -= value;
	}
	
	/**
	 * Description: To multiply the given input.
	 * @param value
	 */
	public void multiply (int value) 
	{
		total *= value;
	}
	
	/**
	 * Description: To divide the given input.
	 * @param value
	 */
	public void divide (int value) 
	{
		if(value == 0)
		{
			total = 0;
		}
		else
		{
			total /= value;
		}
	}
	
	/**
	 * Description: To return the history in string form.
	 * @return String of history.
	 */
	public String getHistory () 
	{
		return "";
	}
}