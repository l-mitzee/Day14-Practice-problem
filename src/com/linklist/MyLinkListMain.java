package com.linklist;

public class MyLinkListMain {

	public static void main(String[] args) {

		
		MyLinkedList<Integer> listNode = new MyLinkedList<>();
        MyNode<Integer> firstNode = new MyNode<Integer>(56);
        MyNode<Integer> secondNode = new MyNode<Integer>(30);
        MyNode<Integer> thirdNode = new MyNode<Integer>(70);

        listNode.add(firstNode);
        listNode.add(secondNode);
        listNode.add(thirdNode);
        listNode.printlist();
		
	}
	
}
