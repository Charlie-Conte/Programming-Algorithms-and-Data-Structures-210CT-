package week3;

import main.Manager.Tasks;

public class task1 implements Tasks
{
	@Override
	public void run() 
	{
		main.Manager.consoleSpace(1);
		
		System.out.println("Please enter the sentance you wish to reverse (words seperated by spaces)");
		
		String input = main.Manager.read.nextLine();
		String output = "";
		
		//String input = "the rain in Spain falls mainly on the plain";
		
		String[] words = input.split(" ");//splits the sentence into words, where there are spaces, that go in the string array 
		for(int i = words.length - 1; i >= 0; i--)
		{
			output = output + words[i] + " ";
		}
		
		System.out.println(output);
		
		main.Manager.consoleSpace(1);
		System.out.println("open pseudocode  y / n");
		String choice = main.Manager.read.nextLine();
		if (choice.equals("y")) main.openText.openPsuedoCode("210CT Week 3 Coursework TASK 1 PSEUDO.txt");
		
		
		System.out.println("Rerun Code  y / n");
		String choice2 = main.Manager.read.nextLine();
		if (choice2.equals("y")) run();	
		
		
	}
}