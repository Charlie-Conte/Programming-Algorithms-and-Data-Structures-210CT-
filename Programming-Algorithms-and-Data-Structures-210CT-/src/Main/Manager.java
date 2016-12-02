package main;

import java.util.Scanner;
import java.io.IOException;
import java.util.HashMap;

public class Manager 
{
	
	public static Scanner read;
	public static HashMap<String, Tasks> tasks = new HashMap<>();//using this and overwrites i can create a tasks launch selector

	public static void main (String[] args)
	{
		tasks.put("week1 1",new week1.task1());//id's and locations of methods 
		tasks.put("week1 2",new week1.task2());
		
		tasks.put("week2 1",new week2.task1());
		tasks.put("week2 2",new week2.task2());
		tasks.put("week2 3",new week2.task3());
		
		tasks.put("week3 1",new week3.task1());
		tasks.put("week3 2",new week3.task2());
		tasks.put("week3 3",new week3.task3());
		
		tasks.put("week4 1",new week4.task1());
		
		tasks.put("week5 1",new week5.task1());
		tasks.put("week5 2",new week5.task2());
		
		tasks.put("week6 1",new week6.task1());
		
		tasks.put("week7 1",new week7.task1());
		tasks.put("week7 2",new week7.task2());
		
		
		read = new Scanner(System.in);//read line in command line 

		
		

		System.out.println("Please Type in the Week's Worth of CourseWork You Wish To View");
		System.out.println("Accetable Format is \"week1\" \"week2\" etc");
		String week = read.nextLine();//id part 1
		
		
		consoleSpace(2);
		
		
		System.out.println("Please Type in the Week's Task");
		System.out.println("Accetable Format is \"1\" \"2\" etc");
		String task = read.nextLine();//id part 2
		
		consoleSpace(2);
		
		try 
		{
			tasks.get(week + " " + task).run();//try's to run a method depending on the key the user entered
		} 
		catch (Exception e) 
		{
			System.out.println("Error");
			e.printStackTrace();
		}
		
		
		main.Manager.consoleSpace(20);
		System.out.println("Rerun Application  y / n");//choice to rerun application
		consoleSpace(1);
		String choice = main.Manager.read.nextLine();
		if (choice.equals("y")) main(args);
		
				
	}
	
	
	public static interface Tasks//second part of tasks launch selector
	{
		void run() throws IOException;
	}


	public static void consoleSpace(int num) //simple method to make the application more legible via new lines
	{
		for (int i=0; i<num; i++)
		{
			System.out.println();
		}
	}
}

