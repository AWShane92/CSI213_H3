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
		dll.add(a);	
		dll.add(b);
		dll.add(e);
		dll.add(d);
		//dll.add(b2);
		
		dll.printList();
		System.out.println(" ");
		dll.reverseList();
		System.out.println(" ");
		System.out.println(dll.size());
		System.out.println(" ");
		System.out.println(dll.findNode(a));
		System.out.println(dll.findNode(c));
		System.out.println(dll.findNode(e));
		System.out.println(" ");
		dll.delete(a);
		dll.delete(c);
		dll.delete(e);
		System.out.println(dll.findNode(a));
		System.out.println(dll.findNode(c));
		System.out.println(dll.findNode(e));
		System.out.println(" ");
		System.out.println(dll.size());
		System.out.println(" ");
		dll.printList();
	}
}
