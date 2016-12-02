package week7;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Stack;

import main.Manager;
import main.Manager.Tasks;
import week7.Graph.Node;


public class task2 implements Tasks 
{
	@Override
	
	
	public void run()
	{
		Stack<Node> nStack = new Stack<Node>();
		String out = "";

		task1Copy();//generates graph
		
		System.out.println("Please enter the number of the starting node");
		int choiceStart = Manager.read.nextInt();
		System.out.println("Please choose the traversal method");
		System.out.println("enter	1	for Breadth First Traversal");
		System.out.println("enter	2	for Depth First Traversal");
		int choiceTraversal = Manager.read.nextInt();
		
		Node start = test.GetNode(choiceStart);
		start.visited=true;
		
		
		if (choiceTraversal == 1)
		{
			nStack.push(start);//adds start to the output
			out = out + start.value + "\t";
			while(!nStack.isEmpty())
			{	

				start = nStack.firstElement();
				nStack.remove(0);//acts like a queue
				
				for (int p = 0; p < start.ConnectedNodes.size();p++)//runs once for every child of start
				{
					Node current = test.GetNode(start.ConnectedNodes.get(p));
					
					if (current.visited == false)
					{
						current.visited = true;
						nStack.push(current);
						out = out + current.value + "\t";
					}
				}
				
			}
			
		}
		if (choiceTraversal == 2)
		{
			nStack.push(start);//adds start to the output
			out = out + start.value + "\t";
			while(!nStack.isEmpty())
			{	

				start = nStack.peek();//Looks at the object at the top of this stack without removing it from the stack
				
				boolean visitedChild = false;
				for (int p = 0; p < start.ConnectedNodes.size();p++)//runs once for every child of start
				{
					Node current = test.GetNode(start.ConnectedNodes.get(p));
					
					if (current.visited == false)
					{
						current.visited = true;
						nStack.push(current);
						out = out + current.value + "\t";
						visitedChild = true;
						break;//allows for backtracking
					}

				}
				if (visitedChild == false)
				{
					nStack.pop();
				}
				
			}
		}
		
		
		
		
		
		
		File explanation = new File(System.getProperty("user.dir").replaceAll("\\\\", "\\\\\\\\") + "\\PsuedoCode&Text_Tasks\\" + "210CT Week 7 Coursework TASK 2 output.txt");//directory location
		FileWriter writer = null;
		
		try 
		{
			writer = new FileWriter(explanation);
			writer.write(out);
		   
		} catch (Exception e) {
		}
		finally 
		{
			if (writer != null) try { writer.close(); } catch (IOException ignore) {}
		}
		
		
		main.Manager.consoleSpace(1);
		System.out.println("open output text file  y / n");
		String choice = main.Manager.read.next();
		if (choice.equals("y")) main.openText.openPsuedoCode("210CT Week 7 Coursework TASK 2 output.txt");
		
		
		System.out.println("Rerun Code  y / n");
		String choice2 = main.Manager.read.next();
		if (choice2.equals("y")) run();	
	}
	
	
	public void task1Copy()
	{
		
		
		test.addNode(0);
		test.addNode(1);
		test.addNode(2);
		test.addNode(3);
		test.addNode(4);
		test.addNode(5);
		test.addNode(6);
		test.addNode(7);
		test.addNode(8);
		test.addNode(9);
		test.addNode(10);
		test.addNode(11);
		test.addNode(12);
		
		test.addEdge(0, 1);
		test.addEdge(0, 2);
		test.addEdge(0, 3);
		test.addEdge(1,4);
		test.addEdge(1,5);
		test.addEdge(1,6);
		test.addEdge(2,7);
		test.addEdge(3,8);
		test.addEdge(3,9);
		test.addEdge(8,10);
		test.addEdge(8,11);
		test.addEdge(8,12);

		
		
		
		//displays node value and connected nodes
		for(int h = 0; h < test.GetSize();h++)
		{
			System.out.println("Node:\t" + test.GetNode(h).value + "\t connected nodes: " + test.GetNode(h).ConnectedNodes.toString());
		}

		

	}
	public Graph test = new Graph();
}
