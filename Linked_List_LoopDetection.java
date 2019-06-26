import java.util.*;

// To check if String has repeating character!
public class Linked_List_LoopDetection {
	// We can also set the length as the length of input string to decrease space
	public static void main(String[] args) {
		String content_data = "First Input";
		System.out.print("Creating the first A_Node, the content is :"+content_data);
		A_Node first_A_Node = create(content_data);
		
		//Adding two A_Nodes which are different type of objects
		A_Node second_A_Node = A_Node_append(first_A_Node, 20);	
		A_Node third_A_Node = A_Node_append(second_A_Node, "THIRD INFO.");
		
		A_Node_showing(first_A_Node);
		
		//Deleting
		A_Node_deleting(second_A_Node);
		
		
		//Adding new A_Nodes
		A_Node fourth_A_Node = A_Node_append(third_A_Node, "4th A_Node content!");
		
		A_Node_showing(first_A_Node);
	}

	private static void A_Node_deleting(A_Node deletedA_Node) {
		// TODO Auto-generated method stub
		System.out.println("\nDeleting A_Node... ->"+deletedA_Node.toString());
		deletedA_Node.front_A_Node.next_A_Node = deletedA_Node.next_A_Node;
		deletedA_Node.next_A_Node.front_A_Node = deletedA_Node.front_A_Node;
		deletedA_Node = null;
	}

	private static void A_Node_showing(A_Node A_Node) {
		// TODO Auto-generated method stub
		System.out.println("\n\nPrint All Linked List From This A_Node ->"+A_Node.toString());
		while(true) {
			System.out.print("．"+A_Node.data.toString()+"---(F)");
			System.out.print(A_Node.front_A_Node!=null? A_Node.front_A_Node.data.toString()+"(N)":"no front A_Node"+"(N)");
			System.out.print(A_Node.next_A_Node!=null? A_Node.next_A_Node.data.toString()+" =>\n":"no next A_Node =>\n");
			if(A_Node.next_A_Node==null) {break;}
			else {A_Node = A_Node.next_A_Node;}
		}
		
	}

	private static A_Node A_Node_append(A_Node A_Node, Object second_content) {
		// TODO Auto-generated method stub
		A_Node next_A_Node = A_Node.AppendA_Node(second_content);
		return next_A_Node;
	}

	private static A_Node create(Object content_data) {
		// TODO Auto-generated method stub
		A_Node new_A_Node = new A_Node(content_data);
		return new_A_Node;
	}
	
	
}

class A_Node {
	A_Node next_A_Node = null;
	A_Node front_A_Node = null;
	Object data;
	
	public A_Node(Object input_data) {
		data = input_data;
	}
	
	public A_Node AppendA_Node(Object second_content) {
		// TODO Auto-generated method stub
		System.out.print("\nCreating and connecting the new A_Node, the content is :"+second_content.toString());
		A_Node new_A_Node = new A_Node(second_content);
		new_A_Node.front_A_Node = this;
		next_A_Node = new_A_Node;
		
		return new_A_Node;
	}

	
}