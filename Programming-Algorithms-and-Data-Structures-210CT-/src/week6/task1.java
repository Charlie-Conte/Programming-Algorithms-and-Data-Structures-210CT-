package week6;

import main.Manager.Tasks;

public class task1 implements Tasks 
{
	@Override
	public void run()
	{
		BinarySearchTreeSort.test();
		
		
		System.out.println("Rerun Code  y / n");
		String choice2 = main.Manager.read.next();
		if (choice2.equals("y")) run();	
		
	}
	
	

}
