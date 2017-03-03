package H3;

public class Node {

	//Properties
	private String data;
	private Node previous;
	private Node next;
	private int id;
	
	
	//Constructor
	public Node(){
		this.id = 0;
		this.data = "empty";
		this.next = null;
		
	}
	public Node(int id, String data){
		this.id = id;
		this.data = data;
		this.previous = null;
		this.next = null;
	}	
	
	//Methods
	public String getData(){
		return this.data;
	}
	public void setData(String data){
		this.data = data;
	}
	public Node getNext(){
		return this.next;
	}
	public void setNext(Node next){
		this.next = next;
	}
	public Node getPrev(){
		return this.previous;
	}
	public void setPrev(Node previous){
		this.previous = previous;
	}
	public int getId(){
		return this.id;
	}
	public void setId(int id){
		this.id = id;
	}
	public void print(){
		
		System.out.println("This data is:"+ this.data);
	}
	
}
