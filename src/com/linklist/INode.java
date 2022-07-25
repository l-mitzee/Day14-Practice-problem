package com.linklist;

public interface INode<K> {
	K getKey();
	void setKey(K key);
	INode<K> getNext();
	void setNext (INode<K> next);

}

class MyNode<K> implements INode<K>{
	private K key;
	private INode<K> next;
	public MyNode(K key) {
		this.key = key;
		this.next = null;
	}

	
	@Override
	public K getKey(){
		return key;
	}

	@Override
	public void setKey(K key) {
		// TODO Auto-generated method stub
		this.key = key;
	}

	@Override
	public INode<K> getNext() {
		// TODO Auto-generated method stub
		return next;
	}

	@Override
	public void setNext(INode<K> next) {
		// TODO Auto-generated method stub
		this.next = next;
	}
	
	@Override
	public String toString() {
		return "MyNode{" + "key= "+ key + ",next=" + next + '}';

		}
		
	}
	

