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
		
		
	}

	private static void node_showing(Node node) {
		// TODO Auto-generated method stub
		System.out.print("\nPrint All Linked List From This Node ->");
		System.out.println(node);
		while(node.next_node!=null) {
			System.out.print(node.data);
			System.out.print(" => ");
			node = node.next_node;
		}
		System.out.println(node.data);
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
	Object data;
	
	public Node(Object input_data) {
		data = input_data;
	}
	
	public Node AppendNode(Object second_content) {
		// TODO Auto-generated method stub
		Node new_node = new Node(second_content);
		System.out.print("Create the new node, the content is :");
		System.out.println(second_content);
		next_node = new_node;
		
		return new_node;
	}

	
}