package main;

public class Queue {
	
	private int front;
	private int rear;
	private int maxSize;
	
	private Object queueArray[];

	public Queue(int maxSize) {
		this.maxSize = maxSize;
		
		front = 0;
		rear = -1;
		
		queueArray = new Object[maxSize];
	}
	
	public boolean isEmpty() {
		return (front == rear + 1);
	}
	
	public boolean isFull() {
		return (rear == maxSize - 1);
	}
	
	public void push(Object item) {
		if (isFull()) {
			System.out.println("Queue 공간이 가득차 있습니다");
		}
		
		rear++;
		queueArray[rear] = item;
	}
	
	public Object pop() {
		Object item = peek();
		front++;
		return item;
	}
	
	public Object peek() {
		if (isEmpty()) {
			System.out.println("Queue 공간이 비어 있습니다");
			return null;
		}
		
		return queueArray[front];
	}
	

}
