package com.homework;

public class questionFive {
	
	public void subString (String str, int idx)
	{
		
		
		String result = "";
		
		char [] myArray = str.toCharArray();
		
	
		for (int i = 0; i < idx; i++)
		{
			
			result = result +myArray[i];
		}
		System.out.println(result);
		
	}

}
