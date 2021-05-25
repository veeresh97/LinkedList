package com.DSLinkList;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MyLinkedListTest {

    @Test
    public void given3NumberWhenAddedToLinkedListShouldAddedToTop() {
        MyNode<Integer> myFirstNode = new MyNode<>(70);
        MyNode<Integer> mySecondNode = new MyNode<>(30);
        MyNode<Integer> myThirdNode = new MyNode<>(56);
        MyLinkList myLinkList = new MyLinkList();
        myLinkList.add(myThirdNode);
        myLinkList.add(mySecondNode);
        myLinkList.add(myFirstNode);
        myLinkList.printMyNodes();
        boolean result = myLinkList.head.equals(myFirstNode) &&
                myLinkList.head.getNext().equals(mySecondNode) &&
                myLinkList.tail.equals(myThirdNode);
        Assertions.assertTrue(result);
    }

    @Test
    public void given3NumberWhenAppendedToLinkedListShouldAddedToLast() {
        MyNode<Integer> myFirstNode = new MyNode<>(70);
        MyNode<Integer> mySecondNode = new MyNode<>(30);
        MyNode<Integer> myThirdNode = new MyNode<>(56);
        MyLinkList myLinkList = new MyLinkList();
        myLinkList.add(myThirdNode);
        myLinkList.append(mySecondNode);
        myLinkList.append(myFirstNode);
        myLinkList.printMyNodes();
        boolean result = myLinkList.head.equals(myThirdNode) &&
                myLinkList.head.getNext().equals(mySecondNode) &&
                myLinkList.tail.equals(myFirstNode);
        Assertions.assertTrue(result);
    }
}
