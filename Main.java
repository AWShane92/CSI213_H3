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
		
		dll.add(a);	
		dll.add(b);
		dll.add(e);
		dll.add(d);
		dll.add(c);
		dll.add(b2);
		
		dll.printList();
		
		System.out.println(dll.getHead().getData());
		System.out.println(dll.getTail().getData());
		System.out.println(dll.findNode(a));
		System.out.println(dll.findNode(c));
		System.out.println(dll.findNode(e));
	}
}
