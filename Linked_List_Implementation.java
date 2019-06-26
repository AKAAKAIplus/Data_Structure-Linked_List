import java.util.*;

// To check if String has repeating character!
public class Linked_List_Implementation {
	// We can also set the length as the length of input string to decrease space
	public static void main(String[] args) {
		String content_data = "First Input";
		System.out.print("Creating the first node, the content is :"+content_data);
		Node first_node = create(content_data);
		
		//Adding two nodes which are different type of objects
		Node second_node = node_append(first_node, 20);	
		Node third_node = node_append(second_node, "THIRD INFO.");
		
		node_showing(first_node);
		
		//Deleting
		node_deleting(second_node);
		
		
		//Adding new nodes
		Node fourth_node = node_append(third_node, "4th node content!");
		
		node_showing(first_node);
	}

	private static void node_deleting(Node deletedNode) {
		// TODO Auto-generated method stub
		System.out.println("\nDeleting Node... ->"+deletedNode.toString());
		deletedNode.front_node.next_node = deletedNode.next_node;
		deletedNode.next_node.front_node = deletedNode.front_node;
		deletedNode = null;
	}

	private static void node_showing(Node node) {
		// TODO Auto-generated method stub
		System.out.println("\n\nPrint All Linked List From This Node ->"+node.toString());
		while(true) {
			System.out.print("．"+node.data.toString()+"---(F)");
			System.out.print(node.front_node!=null? node.front_node.data.toString()+"(N)":"no front node"+"(N)");
			System.out.print(node.next_node!=null? node.next_node.data.toString()+" =>\n":"no next node =>\n");
			if(node.next_node==null) {break;}
			else {node = node.next_node;}
		}
		
	}

	private static Node node_append(Node node, Object second_content) {
		// TODO Auto-generated method stub
		Node next_node = node.AppendNode(second_content);
		return next_node;
	}

	private static Node create(Object content_data) {
		// TODO Auto-generated method stub
		Node new_node = new Node(content_data);
		return new_node;
	}
	
	
}

class Node {
	Node next_node = null;
	Node front_node = null;
	Object data;
	
	public Node(Object input_data) {
		data = input_data;
	}
	
	public Node AppendNode(Object second_content) {
		// TODO Auto-generated method stub
		System.out.print("\nCreating and connecting the new node, the content is :"+second_content.toString());
		Node new_node = new Node(second_content);
		new_node.front_node = this;
		next_node = new_node;
		
		return new_node;
	}

	
}