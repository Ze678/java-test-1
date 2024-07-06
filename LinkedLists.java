package org.example;

import java.util.LinkedList;

// DOUBLY LINKED LIST

public class Main {
    public static void main(String[] args) {
        LinkedList<String>linkedList = new LinkedList<String>();
//STACK
//        linkedList.push("A");
//        linkedList.push("B");
//        linkedList.push("C");
//        linkedList.push("D");
//        linkedList.push("F");
//        linkedList.pop();
//QUEUE
        linkedList.offer("A");
        linkedList.offer("B");
        linkedList.offer("C");
        linkedList.offer("D");
        linkedList.offer("F");
        linkedList.poll();

//Add and element between the D and F.
        linkedList.add(4, "E");
        linkedList.remove("E");
//Getting the first element of the list.
        System.out.println(linkedList.peekFirst());
        System.out.println(linkedList.peekLast());
//Adding the first and last  elements.
        linkedList.addFirst("0");
        linkedList.addLast("G");
//Removing the First and Last element.
        String first = linkedList.removeFirst();
        String last = linkedList.removeLast();

        System.out.println(linkedList);

    }
}
