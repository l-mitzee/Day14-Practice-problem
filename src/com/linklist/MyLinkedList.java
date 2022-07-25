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
    	
    	public void printlist() {
    		
    	System.out.println("MyNode is: "+head);
    }   
    

//    public void add(INode<K> node){
//        INode<K> tempNode = node;
//        if (head == null){
//            head = tempNode;
//            tail = tempNode;
//        }
//        else {
//            tail.setNext(tempNode);
//            tail = tempNode;
//        }
//    }
//    public void printList(){
//        System.out.println("MyNodes :-  "+head);
//    }
}