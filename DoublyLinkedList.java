package H3;

public class DoublyLinkedList {
	
	private Node head = null;
	private int size = 0;
	
	public Node getHead(){
		return this.head;
	}
	
	public void add(Node node){
		
		Node link = head;
		Node temp = null;
		
		if(head == null){
			head = node;
			size++;
		}
		else if(link.getId() > node.getId()){
			
			int li = link.getId();
			int ni = node.getId();
			
			while(li > ni){
				
				if(link.getPrev() == null){
					link.setPrev(node);
					node.setNext(link);
					size++;
				}else if ((ni + 1) == li){
					
					temp = link.getPrev();
					link.setPrev(node);
					node.setPrev(temp);
					node.setNext(link);
					size++;
				}
				
				link = link.getPrev();
				li = link.getId();
				
			}
		}
		else{
			
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
		
		Node link = head;
		Node temp = null;
		boolean inLink = node.getPrev() != null || node.getNext() != null;
		
		if(size == 0){
			System.out.println("The list is Empty");
			return;
			
		}
		else if(this.head == node){
			
			temp = head.getNext();
			head.setNext(null);
			head = temp;
			head.setPrev(null);
			size = size - 1;
		}
		else if(inLink){
	
			int li = link.getId();
			int ni = node.getId();
			
			while(li < ni){
					
					if(li + 1 == ni){
						temp = node.getNext();
						link.setNext(temp);
						temp.setPrev(link);
						node.setPrev(null);
						node.setNext(null);
						size= size - 1;
						
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
