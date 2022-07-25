package com.linklist;

public interface INode<K> {
    K getKey();
    void setNext(INode<K> next);
	void setKey(K key);
    INode<K> getNext();
    void settNext(INode<K> next);

}
public class MyNode<K> implements INode<K>{

    private K key;
    private INode<K> next;

    public MyNode(K key){
        this.key = key;
    }
    @Override
    public K getKey() {
        return key;
    }

    @Override
    public void setKey(K key) {
        this.key=key;
    }

    @Override
    public INode<K> getNext() {
        return next;
    }

    @Override
    public void setNext(INode<K> next) {
        this.next = next;
    }
    public String toString(){
        StringBuilder myNodeBuilder = new StringBuilder();
        myNodeBuilder.append("MyNode{"+"Key=").append(key).append("}");
        if(next != null){
            myNodeBuilder.append("-->").append(next);
        }
        return myNodeBuilder.toString();
    }
	@Override
	public void settNext(INode<K> next) {
		// TODO Auto-generated method stub
		
	}
}
















//public interface INode<K> {
//	K getKey();
//	void setttKey(K key);
//	INode<K> getNext();
//	void setttNext (INode<K> next);
//
//}
//
//class MyNode<K> implements INode<K>{
//	private K key;
//	private INode<K> next;
//	public MyNode(K key) {
//		this.key = key;
//		this.next = null;
//	}
//
//	
//	@Override
//	public K getKey(){
//		return key;
//	}
//
//	@Override
//	public void setttKey(K key) {
//		// TODO Auto-generated method stub
//		this.key = key;
//	}
//
//	@Override
//	public INode<K> getNext() {
//		// TODO Auto-generated method stub
//		return next;
//	}
//
//	@Override
//	public void setttNext(INode<K> next) {
//		// TODO Auto-generated method stub
//		this.next = next;
//	}
//	
//	@Override
//	public String toString() {
//		return "MyNode{" + "key= "+ key + ",next=" + next + '}';
//
//		}
//		
//	}
//	

