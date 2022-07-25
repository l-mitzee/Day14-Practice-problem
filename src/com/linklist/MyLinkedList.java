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

		 public INode<K> popFirst(){
		        if(head==null){
		            System.out.println("LinkedList is already empty ");
		            return null;
		        }
		        INode<K> removedNode = head;
		        head=head.getNext();
		        return  removedNode;
		    }
		    public INode<K> pop(){
		        if(head==null){
		            System.out.println("LinkedList is already empty ");
		            return null;
		        }
		        INode<K> tempNode;
		        INode<K> removedNode=tail;

		        tempNode = head;
		        while(tempNode.getNext() != tail){
		            tempNode = tempNode.getNext();
		        }
		        tempNode.setNext(null);
		        tail=tempNode;
		        return removedNode;
		    }
		    public void searching(INode<K> node){
		        if(head==null){
		            System.out.println("LinkedList is already empty ");
		            return;
		        }
		        INode<K> tempNode=head;
		        boolean check=false;

		        while(tempNode != null){

		            K data1 = tempNode.getKey();
		            K data2 = node.getKey();
		            if(data1.equals(data2)){
		                System.out.println("30 is present in the list");
		                check = true;
		                return;
		            }
		            tempNode = tempNode.getNext();
		        }//end while
		        if(check == false){
		            System.out.println("30 not found in the list");
		        }
		    }
}