package com.DSLinkList;

public class MyLinkList<K> {
    public INode<K> head;
    public INode<K> tail;

    public MyLinkList() {
        this.head = null;
        this.tail = null;

    }

    public void add(INode newNode) {
        if (this.tail == null)
            this.tail = newNode;
        if (this.head == null)
            this.head = newNode;
        else {
            INode tempNode = this.head;
            this.head = newNode;
            this.head.setNext(tempNode);
        }
    }

    public void printMyNodes() {
        StringBuffer myNodes = new StringBuffer("My nodes: ");
        INode tempNode = head;
        while (tempNode.getNext() != null) {
            myNodes.append(tempNode.getKey());
            System.out.println(myNodes);
            if (!tempNode.equals(tail)) myNodes.append("->");
            tempNode = tempNode.getNext();
        }
        myNodes.append(tempNode.getKey());
        System.out.println(myNodes);
    }

    public void append(INode newNode) {
        if (this.head == null)
            this.head = newNode;
        if (this.tail == null)
            this.tail = newNode;
        else {
            this.tail.setNext(newNode);
            this.tail = newNode;
        }
    }

    public void insertNode(INode myNode, INode newNode) {
        INode tempNode = myNode.getNext();
        myNode.setNext(newNode);
        newNode.setNext(tempNode);
    }

    public void pop() {
        this.head = this.head.getNext();
    }
    public void popLast() {
        INode tempNode = head;
        while(!tempNode.getNext().equals(tail)) {
            tempNode = tempNode.getNext();
        }
        this.tail = tempNode;
        tempNode.setNext(null);
    }
    public boolean search(INode key) {
        INode tempNode = head;
        while(tempNode !=null && tempNode.getNext()!=null) {
            if (tempNode.getKey()==key.getKey()) {
                return true;
            }
            tempNode = tempNode.getNext();
        }
        return false;
    }
    public void deleteNode(INode myNode) {
        INode tempNode = head;
        INode previousNode = null;
        while(tempNode != null && tempNode.getKey() != myNode.getKey()) {
            previousNode = tempNode;
            tempNode = tempNode.getNext();
        }
        previousNode.setNext(tempNode.getNext());
    }
    public int getSize() {
        int size = 0;
        INode tempNode = head;
        while (tempNode != null) {
            size++;
            tempNode = tempNode.getNext();
        }
        return size;
    }
}

