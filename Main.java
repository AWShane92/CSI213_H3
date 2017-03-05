package H3;

public class Main {

	public static void main(String[]args){
		
		Node a = new Node("Aplha");
		Node b = new Node(1,"Bravo");
		Node c = new Node(2,"Charlie");
		Node d = new Node(3,"Delta");
		DoublyLinkedList dl = new DoublyLinkedList();
		
		dl.add(a);
		dl.add(b);
		dl.add(c);
		
		System.out.println(b.getPrev().getData());
		System.out.println(a.getNext().getData());
		System.out.println(b.getNext().getData());
		System.out.println(dl.findNode(d));
		System.out.println("Length of list is: " + dl.getSize());
	}
}
