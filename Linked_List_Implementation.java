import java.util.*;

// To check if String has repeating character!
public class Linked_List_Implementation {
	// We can also set the length as the length of input string to decrease space
	public static void main(String[] args) {
		
		String content_data = "First Input";
		Node first_node = create(content_data);
		System.out.print("Create the first node, the content is :");
		System.out.println(content_data);
		
		int second_content = 20;
		Node second_node = node_append(first_node, second_content);
		
		
		String third_content = "THIRD INFO.";
		Node third_node = node_append(second_node, third_content);
		
		node_showing(first_node);
		
		node_deleting(second_node);
		
		
		String fourth_content = "4th node content!";
		Node fourth_node = node_append(third_node, fourth_content);
		
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
			System.out.print(node.data.toString()+"/(F)");
			System.out.print(node.front_node!=null? node.front_node.data.toString():"no front node"+"/(N)");
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
		Node new_node = new Node(second_content);
		new_node.front_node = this;
		System.out.print("\n\nCreate the new node, the content is :");
		System.out.println(second_content);
		next_node = new_node;
		
		return new_node;
	}

	
}