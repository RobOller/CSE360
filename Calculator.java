/*
 * Author Robert Oller
 * ClassID CSE 360 - Assignment 2

 * Description: To emulate a calculator using basic arithmetic.
 */
package cse360assign2;

public class Calculator 
{

	private int total;
	private String history;
	
	/**
	 * Description: Calculator constructor.
	 */
	public Calculator () 
	{
		total = 0;  // not needed - included for clarity
		history = "0"; // Since the total starts at 0
	}
	
	/**
	 * Description: To return the total.
	 * @return The total
	 */
	public int getTotal () 
	{
		return total;
	}
	
	/**
	 * Description: To add the given input by the total and record the history of the calculation.
	 * @param Given value
	 */
	public void add (int value) 
	{
		total += value;
		history += " + " + value;
	}
	
	/**
	 * Description: To subtract the given input by the total and record the history of the calculation..
	 * @param Given value
	 */
	public void subtract (int value) 
	{
		total -= value;
		history += " - " + value;
	}
	
	/**
	 * Description: To multiply the given input by the total and record the history of the calculation..
	 * @param Given value
	 */
	public void multiply (int value) 
	{
		total *= value;
		history += " * " + value;
	}
	
	/**
	 * Description: To divide the total by the given input and record the history of the calculation..
	 * @param Given value
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
		history += " / " + value;
	}
	
	/**
	 * Description: To return the history in string form.
	 * @return String of history.
	 */
	public String getHistory () 
	{
		return history;
	}
}