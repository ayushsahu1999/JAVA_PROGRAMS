
public class LinkedList {
	
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
	
	public boolean search(int value) {
		Node ptr = head;
		while (ptr != null) {
			if (ptr.data == value)
				return true;
			ptr = ptr.next;
		}
		return false;
	}
	
	public void delete(int value) {
		Node ptr = head, prev = null;
		
		if (ptr != null && ptr.data == value) {
			head = ptr.next;
			ptr.next = null;
			return;
		}
		
		while (ptr != null) {
			if (ptr.data == value) {
				prev.next = ptr.next;
				ptr.next = null;
				return;
			}
			prev = ptr;
			ptr = ptr.next;
		}
		
		if (ptr == null)
			return;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList list = new LinkedList();
		list.insert(1);
		list.insert(2);
		list.insert(3);
		list.insert(4);
		
		Node ptr = null;
		ptr = list.head;
		
		System.out.println("Insertion");
		while(ptr != null) {
			System.out.print(ptr.data + " ");
			ptr = ptr.next;
		}
		System.out.println();
		
		System.out.print("Search: ");
		if (list.search(5))
			System.out.println("True");
		else
			System.out.println("False");
		
		System.out.println("Deletion");
		list.delete(5);
		
		Node ptr1 = null;
		ptr1 = list.head;
		
		while(ptr1 != null) {
			System.out.print(ptr1.data + " ");
			ptr1 = ptr1.next;
		}
	}

}
