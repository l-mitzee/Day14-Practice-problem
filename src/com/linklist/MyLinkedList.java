package com.linklist;

public class MyLinkedList<K> {
    public INode<K> head;
    public INode<K> tail;

    public MyLinkedList() {
    }
    
    
    public void add(INode<K> node) {
    	INode<K> tempNode = node;
    	if(head==null) {
    		head=tempNode;
    		tail=tempNode;
    	}
    	else {
    		tail.setNext(tempNode);
    		tail=tempNode;
    	}
    	}
    
    public void addFirst(INode<K> node) {
        INode<K> tempNode = node;
        if (head == null) {
            head = node;
            tail = node;
        }
        else{
            tempNode.setNext(head);
            head = tempNode;
        }
    }
    public void addMiddle(INode<K> node) {
        INode<K> newNode = node;
        INode<K> oldNode = node;

        if (head == null) {
            head = node;
            tail = node;
        }
        else{
            oldNode= head.getNext();
            head.setNext(newNode);
            newNode.setNext(oldNode);
        }
    }
    public void printList(){
        System.out.println("MyNode "+head);
    }
    	
    	public void printlist() {
    		
    	System.out.println("MyNode is: "+head);
    }   
    
}