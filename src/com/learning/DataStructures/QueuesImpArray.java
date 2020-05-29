package com.learning.DataStructures;


public class QueuesImpArray {
	int front;
	int rear;
	int queueArr[];
	int capacity;
	int currentSize;
	
	public QueuesImpArray(int sizeofQueue) {
		this.capacity =  sizeofQueue;
		front = 0;
		rear = -1;
		this.queueArr = new int[this.capacity];
	}
	
	public boolean isFull() {
		if(currentSize == capacity) {
			return true;
		}
		return false;
	}
	
	public boolean isEmpty() {
		if(currentSize == 0) {
			return true;
		}
		return false;
	}
	// Method used to add the element in the queue 
	public void enqueue(int value) {
		if(isFull()) {
			System.out.println("The queue is full");
		}else {
			rear++;
			if(rear == capacity -1) {
				rear = 0;
			}
			queueArr[rear] = value;
			currentSize++;
			System.out.println(value + " added to the queue");
		}
	}
	
	//Method used to remove the value from the front of the queue
	public void dequeue() {
		if(isEmpty()) {
			System.out.println("Queue is empty, cannot dequeue the value");
		}else {
			 front++;
			 if(front == capacity-1) {
				 System.out.println(queueArr[front-1]+"removed from the queue");
			 }
			 else {
				 System.out.println(queueArr[front-1]+"removed from the queue");
			 }
			 currentSize--;	 
		}
		
	}
	public  void printQueue() {
		if(isEmpty()) {
			System.out.println("Queue is empty");
		}else {
			for(int i =front;i<=rear;i++) {
				System.out.println(queueArr[i]);
			}
		}
	}
	
	
	public static void main(String[] args) {
		QueuesImpArray obj = new QueuesImpArray(10);
		obj.enqueue(100);
		System.out.println("=========================");
		obj.dequeue();
		obj.dequeue();
	}
}
