package week7;

import main.Manager.Tasks;


public class task1 implements Tasks 
{
	@Override
	public void run()
	{
		Graph test = new Graph();
		
		test.addNode(3);
		test.addNode(13);
		test.addNode(22);
		test.addNode(23);
		test.addNode(11);
		test.addNode(123);
		test.addNode(111);
		test.addNode(213);
		test.addNode(112);
		test.addNode(35);
		test.addNode(153);
		test.addNode(522);
		test.addNode(253);
		
		test.addEdge(3, 13);
		test.addEdge(3, 22);
		test.addEdge(3,23);
		test.addEdge(13,11);
		test.addEdge(22,123);
		test.addEdge(23,111);
		test.addEdge(11,213);
		test.addEdge(123,112);
		test.addEdge(111,35);
		test.addEdge(213,153);
		test.addEdge(112,522);
		test.addEdge(35,253);
		test.addEdge(153,111);
		test.addEdge(522,213);
		test.addEdge(253,123);
		
		
		
		//displays node value and connected nodes
		System.out.println("Node:\t" + test.GetNode(3).value + "\t connected nodes: " + test.GetNode(3).ConnectedNodes.toString());
		System.out.println("Node:\t" + test.GetNode(13).value + "\t connected nodes: " + test.GetNode(13).ConnectedNodes.toString());	
		System.out.println("Node:\t" + test.GetNode(22).value + "\t connected nodes: " + test.GetNode(22).ConnectedNodes.toString());
		System.out.println("Node:\t" + test.GetNode(23).value + "\t connected nodes: " + test.GetNode(23).ConnectedNodes.toString());	
		System.out.println("Node:\t" + test.GetNode(123).value + "\t connected nodes: " + test.GetNode(123).ConnectedNodes.toString());
		System.out.println("Node:\t" + test.GetNode(111).value + "\t connected nodes: " + test.GetNode(111).ConnectedNodes.toString());
		System.out.println("Node:\t" + test.GetNode(213).value + "\t connected nodes: " + test.GetNode(213).ConnectedNodes.toString());	
		System.out.println("Node:\t" + test.GetNode(112).value + "\t connected nodes: " + test.GetNode(112).ConnectedNodes.toString());
		System.out.println("Node:\t" + test.GetNode(35).value + "\t connected nodes: " + test.GetNode(35).ConnectedNodes.toString());
		System.out.println("Node:\t" + test.GetNode(153).value + "\t connected nodes: " + test.GetNode(153).ConnectedNodes.toString());
		System.out.println("Node:\t" + test.GetNode(522).value + "\t connected nodes: " + test.GetNode(522).ConnectedNodes.toString());
		System.out.println("Node:\t" + test.GetNode(253).value + "\t connected nodes: " + test.GetNode(253).ConnectedNodes.toString());
	

		
		main.Manager.consoleSpace(1);
		System.out.println("open pseudocode  y / n");
		String choice = main.Manager.read.next();
		if (choice.equals("y")) main.openText.openPsuedoCode("210CT Week 7 Coursework TASK 1 PSEUDO.txt");
		
		
		System.out.println("Rerun Code  y / n");
		String choice2 = main.Manager.read.next();
		if (choice2.equals("y")) run();	
	
	}
	
	

}
