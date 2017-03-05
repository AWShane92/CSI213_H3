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
			int xi = next.getId();
			int ni = node.getId();
			
			while(xi < ni){
				
				if((xi + 1) == ni){
					next.setNext(node);
					node.setPrev(next);
					size++;
				}
				
				next = next.getNext();
				xi = next.getId();				
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
		
		Node next = head;
		int xi = next.getId();
		int ni = node.getId();
		boolean previous = node.getPrev() != null;
		boolean nextNode = node.getNext() != null;
		boolean inLink = previous || nextNode;
		
		if(next == node){
			return true;
		}
		
		while(xi < ni){	
			
			if((xi+1) == ni){	
					if(inLink){
						return true;
					}
			}	
			
			next = next.getNext();
			xi = next.getId();			
		}
		
		return false;
	
	}

}
