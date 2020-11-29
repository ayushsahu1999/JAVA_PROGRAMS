
public class LinkedListMerge {
	
	class Node {
		int data;
		Node next;
		
		public Node(int data) {
			this.data = data;
			this.next = null;
		}
	}
	
	public Node head = null;
	public Node tail = null;
	
	public void insert(int data) {
		Node newNode = new Node(data);
		
		if (head == null) {
			head = newNode;
			tail = newNode;
		} else {
			tail.next = newNode;
			tail = newNode;
		}
	}
	
	public static Node Merge_list(Node first, Node second, Node temp) {
		Node new_list = null;
		if (first == null)
			return second;
		
		if (second == null)
			return first;
		
		if (first.data < second.data) {
			temp = first;
			first = first.next;
		} else {
			temp = second;
			first = second.next;
		}
		
		new_list = temp;
		
		while (first != null && second != null) {
			if (first.data < second.data) {
				temp.next = first;
				temp = first;
				first = temp.next;
			} else {
				temp.next = second;
				temp = second;
				second = temp.next;
			}
		}
		
		if (first == null)
			temp.next = second;
		if (second == null)
			temp.next = first;
		
		return new_list;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedListMerge first = new LinkedListMerge();
		first.insert(1);
		first.insert(3);
		first.insert(5);
		first.insert(7);
		
		LinkedListMerge second = new LinkedListMerge();
		second.insert(2);
		second.insert(4);
		second.insert(6);
		second.insert(8);
		
		Node result = Merge_list(first.head, second.head, null);
		
		while(result != null) {
			System.out.print(result.data + " ");
			result = result.next;
		}
		
	}

}
