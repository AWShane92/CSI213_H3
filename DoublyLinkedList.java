package H3;

public class DoublyLinkedList {
	
	private Node head = null;
	private Node tail = null;
	private int size = 0;
	
	public Node getHead(){
		return this.head;
	}
	public void setHead(Node head){
		this.head = head;
	}
	
	public Node getTail(){
		return this.tail;
	}
	public void setTail(Node tail){
		
		this.tail = tail;
	}
	
	public int getSize(){
		return this.size;
	}
	
	public void add(Node node){
		
		if(node == null){	
			return;
		}
		if(this.isEmpty()){
			head = tail = node;
			size++;		

		}else if(head == tail){
			
				if(head.compareTo(node) > 0){
					head.setPrev(node);
					this.head = node;
					node.setNext(tail);
				}else{
					tail.setNext(node);
					this.tail = node;
					node.setPrev(head);
				}
			size++;
		}else{	
		Node link = head;
		Node temp = null;
		
		while(link != null){
			
			if(this.head.compareTo(node) > 0){
				head.setPrev(node);
				node.setNext(head);
				this.head = node;
				size++;	
				
			}
			else if(this.tail.compareTo(node) < 0){
				tail.setNext(node);
				node.setPrev(tail);
				this.tail = node;
				size++;				
			}
			else{
				
				if((link.compareTo(node) < 0)&&(link.getNext().compareTo(node) > 0)){
					temp = link.getNext();
					link.setNext(node);
					node.setPrev(link);
					node.setNext(temp);
					size++;	
				}
				else if((link.compareTo(node) == 0)){
					temp = link.getNext();
					link.setNext(node);
					node.setPrev(link);
					node.setNext(temp);	
					size++;	
				}
				
			}
			temp = link;
			link = link.getNext();
			
			}	
		}
	}
	
	public void delete(Node node){
		
		Node link = head;
		Node temp = null;
		
		//returns "The list is empty" is the boolean is true . 
		if(this.isEmpty()){
			System.out.println("The list is Empty");
			return;	
		}
		//If node is not in list return.
		else if(!node.inLink()){ 
			System.out.println("This node" + node.getData() + "is not in this list");
			return;
		}
		//if the head is the node that wants to be deleted. 
		else if(this.head.compareTo(node) == 0){
			/*Gets heads next node set it to temp
			 * sets head next to null and set the temp to the new head
			 * Sets the new head previous to null.
			 */
			temp = head.getNext();
			head.setNext(null);
			this.head = temp;
			head.setPrev(null);
			size--;
		}
		//if the tail is the node that wants to be deleted. 
		else if(this.tail.compareTo(node) == 0){
			/*Gets tail prev node set it to temp
			 * sets tail next to null and set the temp to the new head
			 * Sets the new tail next to null.
			 */
			temp = tail.getPrev();
			tail.setPrev(null);
			this.tail = temp;
			tail.setNext(null);		
			size--;
		}
			//If node is in list do. 
		else if(node.inLink()){
			
			//Since list is in order traverse list forward.
			while(link != null){

					if(link.compareTo(node)== 0){
						temp = node.getNext();
						link.setNext(temp);
						temp.setPrev(link);
						node.setPrev(null);
						node.setNext(null);		
						size--;
						return;
					}
					link = link.getNext();
				}
			
			}
		}
	public void deleteList(){
		this.head= null;
		this.tail= null;
	}
		
	public boolean findNode(Node node){
		
		Node link = head;
		
		if(node.inLink()){
			
			while(link != null){
				
				if(link.compareTo(node) == 0){		
					return true;
				}
				
				link = link.getNext();
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
	
	public void reverseList(){
		
		Node temp = tail;
		
		while(temp != null){	
			temp.print();
			temp = temp.getPrev();			
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
