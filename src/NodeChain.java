
public class NodeChain {
	
	
	public static void main(String[] args) {
	  Node first = new Node(2);
	  Node middle = new Node(5);
	  	first.next = middle;
	  Node last = new Node(7);
	  	middle.next = last;
	  	
	 printList(first);
	 
	}
	
	public static void printList(Node node){
		while(node != null){
			System.out.println(node.value);
			node = node.next;
		}
	}
}

