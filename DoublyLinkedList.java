package H3;

public class DoublyLinkedList {
	
	private Node head = null;
	private int size = 0;
	
	public Node getHead(){
		return this.head;
	}
	
	public void add(Node node){
		
		if(head == null){
			head = node;
			size++;
		}
		else if(size == 1){		
			head.setNext(node);
			node.setPrev(head);
			size++;
		}else{
			
			Node next = head.getNext();
			int hi = head.getId();
			int xi = node.getId();
			
			System.out.println(head.getData());
			System.out.println(head.getId());
			while(hi < xi){
				
				if((hi + 1) == xi){
					next.setNext(node);
					node.setPrev(next);
					size++;
				}
				
				next = next.getNext();
				//hi = next.getId();
				
			}
			
		}
		
	}
	public void setHead(Node head){
		this.head = head;
	}
	
	public int getSize(){
		return this.size;
	}
	
	public boolean findNode(Node node){
		
		return true;
	}

}
