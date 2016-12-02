package week4;

import main.Manager.Tasks;

public class task1 implements Tasks
{
	@Override
	
	public void run() 
	{
		main.Manager.consoleSpace(1);
		int[] test = new int[]{2, 9, 18, 19, 29, 30, 44, 46, 55, 58, 61, 63, 64, 65, 70, 79, 80, 85, 89, 94};
		
		System.out.println("The default array is:");
		for (int i = 0; i < test.length; i++) 
		{
			System.out.print(test[i] + " ");
		}
		
		main.Manager.consoleSpace(2);
		
		System.out.println("do you wish to enter a different custom array y / n");
		String arraychoice = main.Manager.read.next();
		if (arraychoice.equals("y"))
		{
			System.out.println("How many integers do you want in the Array");
			int lengthChoice = main.Manager.read.nextInt();
			main.Manager.consoleSpace(1);
			int[] inputArray = new int[lengthChoice];
			for (int i = 1; i < lengthChoice + 1; i++)
			{
				System.out.println("Please input integer " + i);
				inputArray[i-1] = main.Manager.read.nextInt();
			}
			
			System.out.println("The new array is:");
			for (int i = 0; i < inputArray.length; i++) 
			{
				System.out.print(inputArray[i] + " ");
			}
			main.Manager.consoleSpace(2);
			test = inputArray;
		}
		
		
		System.out.println("Please enter the start of the range to test for");
		int lower = main.Manager.read.nextInt();
		
		System.out.println("Please enter the end of the range to test for");
		int upper = main.Manager.read.nextInt();
		
		
		
		
		System.out.println(binary_range_search(upper, lower, test));
		
		main.Manager.consoleSpace(1);
		System.out.println("open pseudocode  y / n");
		String choice = main.Manager.read.next();
		if (choice.equals("y")) main.openText.openPsuedoCode("210CT Week 4 Coursework TASK 1 PSEUDO.txt");
		
		
		System.out.println("Rerun Code  y / n");
		String choice2 = main.Manager.read.next();
		if (choice2.equals("y")) run();	
		
		
	}
	
	public boolean binary_range_search(int upperKey, int lowerKey, int[] source) 
	{
		//finds if any value exists between two bounds in an array and returns a boolean

		int low = 0;
		int high = source.length - 1;

		while(high >= low) 
		{
			int middle = (low + high) / 2;
			if(source[middle] >= lowerKey && source[middle] <= upperKey) 
			{
				return true;
			}
			if(source[middle] < lowerKey) 
			{
				low = middle + 1;
			}
			if(source[middle] > upperKey) 
			{
				high = middle - 1;
			}
		}
		return false;
		   
		
	}
}