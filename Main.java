package H3;

public class Main {

	public static void main(String[]args){
		
		Node a = new Node("Aplha");
		Node b = new Node(1,"Bravo");
		Node c = new Node(2,"Charlie");
		Node d = new Node(3,"Delta");
		DoublyLinkedList dl = new DoublyLinkedList();
		
		dl.add(c);
		dl.add(d);
		dl.add(b);
		dl.add(a);

		System.out.println(b.getPrev().getData());
		System.out.println(a.getNext().getData());
		System.out.println(b.getNext().getData());
		System.out.println(dl.findNode(d));
		System.out.println("Length of list is: " + dl.getSize());
		
		dl.delete(c);
		dl.delete(b);
		System.out.println(dl.findNode(b));
		System.out.println(dl.findNode(c));
		System.out.println("Length of list is: " + dl.getSize());
	}
}
