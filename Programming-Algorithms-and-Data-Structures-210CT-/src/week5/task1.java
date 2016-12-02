package week5;



import java.util.Vector;

import main.Manager.Tasks;

public class task1 implements Tasks
{
	@Override
	
	public void run() 
	{
		Vector<Integer> seq1 = new Vector<Integer>();
		seq1.add(new Integer(1));
		seq1.add(new Integer(2));
		seq1.add(new Integer(3));
		seq1.add(new Integer(4));
		seq1.add(new Integer(1));
		seq1.add(new Integer(5));
		seq1.add(new Integer(1));
		seq1.add(new Integer(6));
		seq1.add(new Integer(7));
		System.out.println("The default Vector<Integer> is:");
		for (int i = 0; i < seq1.size(); i++) 
		{
			System.out.print(seq1.get(i) + " ");
		}
		
		
		main.Manager.consoleSpace(1);
		
		System.out.println("do you wish to enter a different custom Vector<Integer> y / n");
		String arraychoice = main.Manager.read.next();
		if (arraychoice.equals("y"))
		{	//array generator
			System.out.println("How many integers do you want in the Vector<Integer>");
			int lengthChoice = main.Manager.read.nextInt();
			main.Manager.consoleSpace(1);
			seq1.removeAllElements();
			seq1 = new Vector<Integer>();
			for (int i = 1; i < lengthChoice + 1; i++)
			{
				System.out.println("Please input integer " + i);
				seq1.add(new Integer(main.Manager.read.nextInt()));
			}
			
			System.out.println("The new Vector<Integer> is:");
			for (int i = 0; i < seq1.size(); i++) 
			{
				System.out.print(seq1.get(i) + " ");
			}
			main.Manager.consoleSpace(2);
			
		}
		
		
		
		
		

		Vector<Integer> subSeq = subSequencer(seq1);
		
		
		System.out.println("The smaller Vector<Integer> is:");
		for (int b = 0; b < subSeq.size(); b++) 
		{
			System.out.print(subSeq.get(b) + " ");
		}
		
		main.Manager.consoleSpace(1);
		
		System.out.println("Rerun Code  y / n");
		String choice2 = main.Manager.read.next();
		if (choice2.equals("y")) run();	
		
				
		
	}

	public Vector<Integer> subSequencer(Vector<Integer> sequence)
	{
		int count = 0;
		int tempStart = 0;
				
		int bestLength = 0;
		int bestStart = 0;
		
		for (int i = 0; i < sequence.size() - 1; i++)
		{
			count ++;
			if (sequence.get(i) > sequence.get(i+1))
			{
				
				if (count > bestLength)//only triggers when best length can be improved
				{
					bestLength = count;
					bestStart = tempStart;
								
				}
				
				count = 0;
				tempStart = i+1;
			}
		}
		
		if (count > bestLength)
		{
			bestLength = count;
			bestStart = tempStart;
		}
		

		//new sequence generator
		Vector<Integer> subSequence = new Vector<Integer>();
		for (int j = bestStart; j < bestLength + bestStart; j++)
		{
			subSequence.add(sequence.get(j));
		}
		
		return subSequence;
	}


}
