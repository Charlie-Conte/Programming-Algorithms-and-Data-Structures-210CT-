package week3;

import main.Manager.Tasks;

public class task2 implements Tasks
{
	@Override
	public void run() 
	{
		main.Manager.consoleSpace(1);
		
		System.out.println("enter the integer you wish to find out if it is prime or not");
		
		int input =  main.Manager.read.nextInt();
		boolean result = prime_verify(input, input-1);
		
		if (result)
		{
			System.out.println(input + " is prime");
		}
		else 
		{
			System.out.println(input + " is not prime");
		}
		
		
		
		
		main.Manager.consoleSpace(1);
		System.out.println("open pseudocode  y / n");
		String choice = main.Manager.read.next();
		if (choice.equals("y")) main.openText.openPsuedoCode("210CT Week 3 Coursework TASK 2 PSEUDO.txt");
		
		
		System.out.println("Rerun Code  y / n");
		String choice2 = main.Manager.read.next();
		if (choice2.equals("y")) run();	
		
		
	}
	
	
	public boolean prime_verify (int in, int i) 
	{
		if (i == 1)
		{
			return true;
		}
		if (in % i == 0) 
		{
			return false;
		}
		
		else 
		{
			return prime_verify(in, i-1);	
		}
	}
}