package com.learning.DataStructures;


public class StackImpInArray {//Time complexity : O(1)
	
	int top;
	int size;
	int arr[];
	
	public StackImpInArray(int size) {
		this.size = size;
		this.arr = new int[size];
		this.top = -1; 
		}

	public boolean isEmpty() {
		return (top == -1);
	}
	
	public boolean isFull() {
		return (size-1== top);
	}
	
	public int peek() {
		if(!isEmpty()) {
			return arr[top];	
		}else {
			System.out.println("Stack is Empty");
			return -1; 
		}
	}
	
	public void push(int element) {
		if(!isFull()) {
			top++;
			arr[top] = element;
			System.out.println("Pushed element :"+ element);
		}
		else {
			System.out.println("Stack is full now");
		}
	}
	
	public int pop() {
		if(!isEmpty()) {
			int returnTop = top;
			top--;
			System.out.println("The poped element is : "+ arr[returnTop]);
			return arr[returnTop];
		}
		else {
			System.out.println("Stack is empty");
			return -1;
		}
		
	}
	
	
	
	public static void main(String[] args) {
		StackImpInArray obj1 = new StackImpInArray(20);
		obj1.pop();
		System.out.println("==================");
		obj1.push(100);
		obj1.push(200);
		obj1.push(300);
		obj1.push(400);
		System.out.println("==================");
		obj1.pop();
		obj1.pop();
		System.out.println("==================");
		System.out.println(obj1.peek());
		

	}

}
