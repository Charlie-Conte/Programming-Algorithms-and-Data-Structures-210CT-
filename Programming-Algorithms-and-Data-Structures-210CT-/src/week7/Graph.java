package week7;

import java.util.HashMap;
import java.util.Vector;

public class Graph 
{
	public HashMap<Integer, Node> nodeMap = new HashMap<Integer, Node>();//node holding hashmap
	
	
	public void addNode(int value) 
	{
		
		nodeMap.put(value, new Node(value));//creates a node with a value

	}
	
	public void addEdge(int first, int second)
	{
		Node Ftemp = nodeMap.get(first);
		Node Stemp = nodeMap.get(second);//Grabs the nodes based values
		
		Ftemp.ConnectedNodes.addElement(Stemp.value);
		Stemp.ConnectedNodes.addElement(Ftemp.value);//links nodes
	}
	
	public Node GetNode(int id)
	{
		return nodeMap.get(id);
	}
	
	public int GetSize()
	{
		return nodeMap.size();
	}
	
	public static class Node
	{
		public Node(int value) 
		{

			this.value = value;
			this.ConnectedNodes = new Vector<Integer>();
			this.visited = false;
		}//node contents setter
		public int value;
		public Vector<Integer> ConnectedNodes;
		public boolean visited;
	}
	
}


