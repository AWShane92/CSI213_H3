package H3;

public class DoublyLinkedList {
	
	private Node head = null;
	private Node tail = null;
	private int size = 0;
	
	public Node getHead(){
		return this.head;
	}
	
	public void add(Node node){
		
		Node link = head;
		Node temp = null;
		
		if(head == null){
			//Sets node to the head if the list is empty.
			head = node;
			tail = node;
			size++;
		}
		else if(link.getId() > node.getId()){
			
			//If the head id is greater than the node sets the node to the new head.  
			int li = link.getId();
			int ni = node.getId();
			
			while(li > ni){
				
				//If there is no node before the link sets link's previous to node.
				if(link.getPrev() == null){
					link.setPrev(node);
					head = node;
					head.setNext(link);
					tail = link;
					size++;
				}
				/*If there is a node before the link, gets the links previous node and 
				 * sets the new node in that position of that node and sets links 
				 * previous node to the new nodes previous and sets the link as the
				 * new nodes next.
				 */
				else if ((ni + 1) == li){	
					temp = link.getPrev();
					link.setPrev(node);
					node.setPrev(temp);
					node.setNext(link);
					tail = link;
					size++;
				}
				//Traverses the list backward to ensure nodes are in order. 
				link = link.getPrev();
				li = link.getId();
				
			}
		}
		else{
			
			int li = link.getId();
			int ni = node.getId();
			
			//If ID of the link is less than that of the new node.
			while(li < ni){
				
				//If links next is null set its next to the new node.
				if(link.getNext()==null){
					link.setNext(node);
					node.setPrev(link);
					tail = link;
					size++;
				}
				/*If nodes ID is exactly one digit greater than links ID
				 * get links next node sets it to temp then sets
				 * links next to that new node and sets the new node next
				 * to temp and sets new node previous to link.
				 */
				else if((li + 1) == ni){
					temp = link.getNext();
					link.setNext(node);
					node.setPrev(link);
					node.setNext(temp);
					tail = temp;
					size++;
				}
				//traverses list forward to check next node. 
				link = link.getNext();
				li = link.getId();				
			}
			
		}		
	}
	
	public void delete(Node node){
		
		Node link = head;
		Node temp = null;
		boolean inLink = node.getPrev() != null || node.getNext() != null;
		
		//if size is 0 returns list is empty. 
		if(head== null && tail == null){
			System.out.println("The list is Empty");
			return;	
		}
		//if the head is the node that wants to be deleted. 
		else if(this.head == node){
			/*Gets heads next node set it to temp
			 * sets head next to null and set the temp to the new head
			 * Sets the new head previous to null.
			 */
			temp = head.getNext();
			head.setNext(null);
			head = temp;
			head.setPrev(null);
			size--;
		}
		//If node is not in list return.
		else if(!inLink){ 
			System.out.println("This node" + node.getData() + "is not in this list");
			return;
		}
		//If node is in list do. 
		else if(inLink){
			
			int li = link.getId();
			int ni = node.getId();
			
			//Since list is in order traverse list forward.
			while(li < ni){
					
					//
					if(li + 1 == ni){
						temp = node.getNext();
						link.setNext(temp);
						temp.setPrev(link);
						node.setPrev(null);
						node.setNext(null);				
					}			
				}
			size--;
			}
		}
	public void deleteList(){
		this.head= null;
		this.tail= null;
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
		boolean inLink = (node.getPrev() != null) || (node.getNext() != null);
		
		if(next == node){
			
			return true;
		}
		else if(inLink){
			
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
	public void printList(){
		
		Node temp = head;
		
		while(temp != null){
			temp.print();
			temp = temp.getNext();
			
		}
	}
	
	public boolean isEmpty(){
		
		if(head== null && tail == null){
			return true;
		}else{
			return false;
		}
	}

}
