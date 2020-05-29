package com.learning.DataStructures;


public class StackImpLinkedList {
		Node head;
		
		class Node{
			int value;
			Node nextNode;
		}
		
		public StackImpLinkedList() {
			head = null;
		}
		
		public void push(int element) {
			 Node extraHead =  head;
			 head = new Node();
			 head.value = element;
			// System.out.println("Element pushed is : "+element);
			 head.nextNode = extraHead;
		}
		
		public int pop() {
			if(head == null) {
				System.out.println("Stack is empty");
			}
			int value = head.value;
			head = head.nextNode;
			return value;
		}
		
		public static void printList(Node head) {
			Node temp =head;
			while(temp != null) {
				System.out.print(temp.value+ " ");
				temp = temp.nextNode;
			}
		}
		
	public static void main(String[] args) {
		
		StackImpLinkedList llarr = new StackImpLinkedList();
		llarr.push(100);
		llarr.push(200);
		llarr.push(300);
		llarr.push(400);
		System.out.println("popped element is : "+llarr.pop());
		printList(llarr.head);
	

	}

}
