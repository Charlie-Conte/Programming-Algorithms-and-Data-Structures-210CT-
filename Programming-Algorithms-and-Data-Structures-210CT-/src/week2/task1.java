package week2;

import main.Manager.Tasks;

public class task1 implements Tasks
{
	@Override
	public void run() 
	{
		main.Manager.consoleSpace(1);
		
		
		
		main.Manager.consoleSpace(1);
		System.out.println("open pseudocode  y / n");
		String choice = main.Manager.read.nextLine();
		if (choice.equals("y")) main.openText.openPsuedoCode("210CT Week 2 Coursework TASK 1 PSEUDO.txt");
		
		
		main.Manager.consoleSpace(20);
		System.out.println("Rerun Code  y / n");
		String choice2 = main.Manager.read.nextLine();
		if (choice2.equals("y")) run();
	}
}