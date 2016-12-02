package week3;

import main.Manager.Tasks;

public class task3 implements Tasks
{
	@Override
	public void run() 
	{
		main.Manager.consoleSpace(1);
		
		System.out.println("Please enter the string you wish to remove the vowels from");
		
		String input = main.Manager.read.nextLine();
		
		System.out.println(Vowel_Remover(input, 0, ""));
		
		
		main.Manager.consoleSpace(1);
		System.out.println("open pseudocode  y / n");
		String choice = main.Manager.read.nextLine();
		if (choice.equals("y")) main.openText.openPsuedoCode("210CT Week 3 Coursework TASK 3 PSEUDO.txt");
		
		
		System.out.println("Rerun Code  y / n");
		String choice2 = main.Manager.read.nextLine();
		if (choice2.equals("y")) run();	
		
		
	}

	public String Vowel_Remover(String input, int i, String output) 
	{
		if(i == input.length())
		{
			return output;
		}
		
		char here = input.charAt(i);
	    
	    if (Character.toString(here).matches("[aeiouAEIOU]")) 
	    {
	        return Vowel_Remover(input,i + 1,output);
	    } 
	    else 
	    {
	        return Vowel_Remover(input,i + 1,output + here);
	        
	    }
		
	}
	
	
}