package dataStructures;

import java.util.ArrayList;
import java.util.LinkedList;

public class LinkedListExample {
    public static void main(String[] args) {
        LinkedList<String> namesLinkedList = new LinkedList<>();
        ArrayList<String> namesArrayList = new ArrayList<>();

        // Adding things is identical
        namesLinkedList.add("P");
        namesLinkedList.add("B");
        namesLinkedList.add("T");
        namesLinkedList.add("W");

        // ArrayList
        // fast to access (uses Array in the background)
        // slow when adding/removing. It has to create new array list in a situation like this

        // LinkedList
        // slow access (starts from the beginning)
        // extremely fast when adding/removing items. It does not need to change whole collection, just changes a small area
    }
}
