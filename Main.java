package H3;

public class Main {

	public static void main(String[]args){
		
		Node a = new Node("Aplha");
		Node b = new Node(1,"Bravo");
		Node b2 = new Node(1,"Bravo");
		Node c = new Node(2,"Charlie");
		Node d = new Node(3,"Delta");
		Node e = new Node(4,"Echo");
		DoublyLinkedList dll = new DoublyLinkedList();
		
		dll.add(c);
		dll.add(e);
		dll.add(d);
		dll.add(b);
		dll.add(a);
		//Adds node of same variable.
		dll.add(b2);
		dll.printList();
		
		dll.deleteList();
		dll.isEmpty();
		
	}
}
