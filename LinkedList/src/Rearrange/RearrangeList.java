package Rearrange;

import ReverseLinkedList.Node;

public class RearrangeList {

	public void rearrangeList(Node[] head, Node tail){

		if(tail==null){
			/*Node temp =head[0].next;
			head[0].next = tail;
			head[0].next.next = temp;
			head[0] = head[0].next;*/
			return;
		}

		rearrangeList(head, tail.next);
		if(head[0]!=null && head[0].next!=tail){					
			
			if(head[0]==tail){
				return;
			}
			tail.next=null;
			Node temp = head[0].next;
			head[0].next = tail;
			head[0].next.next = temp;
			head[0] = head[0].next;
			if(head[0]!=null){
				head[0] = head[0].next;
			}

		}

	}
	public static void main(String[] args) {
		Node head =new Node(1);
		Node n2 =new Node(2);
		Node n3 =new Node(3);
		Node n4 =new Node(4);
		//Node n5 =new Node(5);

		head.next = n2;
		n2.next = n3;
		n3.next = n4;
		n4.next = null;
		//n5.next = null;

		RearrangeList rl = new RearrangeList();
		Node[] h = {head};
		rl.rearrangeList(h, head);

		while(head!=null){
			System.out.println(head.value);
			head = head.next;
		}
	}
}
