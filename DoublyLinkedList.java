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
			
			Node link = head.getNext();
			Node temp = null;
			int li = link.getId();
			int ni = node.getId();
			
			while(li < ni){
					
				if(link.getNext()==null){
					link.setNext(node);
					node.setPrev(link);
					size++;
				}
				else if((li + 1) == ni){
					temp = link.getNext();
					link.setNext(node);
					node.setPrev(link);
					node.setNext(temp);
					size++;
				}
				
				link = link.getNext();
				li = link.getId();				
			}			
		}	
	}
	
	public void delete(Node node){
		
		if(size == 0){
			return;
		}
		else if(head != null){
			if(head.getId()==node.getId()){
				head = null;
			}
		}else{
		
			Node deleteNode = head;
			int di = deleteNode.getId();
			int ni = node.getId();
			boolean inLink = node.getPrev() != null || node.getNext() != null;
		
			if(inLink){
			
				while(di < ni){
					if((di+1)==ni){
					
					
					}		
				}	
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
		boolean inLink = node.getPrev() != null || node.getNext() != null;
		
		if(next == node){
			return true;
		}
		
		if(inLink){
			
			while(xi < ni){	
			
				if((xi+1) == ni){	
						return true;
				}	
			
				next = next.getNext();
				xi = next.getId();			
			}
		}
		return false;
	
	}

}
