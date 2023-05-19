package LoopDetection;

/**
 * 05-15-23
 * Given a circular linked list, implement an algorithm that returns the node at the beginning of the loop.
 * DEFINITION:
 * Circular linked list: A (corrupt) linked list in which a node's next pointer points to an earlier node, to make a
 * loop in the linked list.
 * EXAMPLE
 * Input: A -> B -> C -> D -> E -> C [the same C as earlier]
 * Output: C
 */

import java.util.HashMap;

public class LoopDetection {

    static class LinkedList{
        Node head;
        Node tail;

        static class Node{
            char data;
            Node next;

            Node(char data){
                this.data = data;
                next = null;
            }
        }

        public static void insert(LinkedList linkedList, Node newNode){
            //Node newNode = new Node(data);
            if(linkedList.head == null){
                linkedList.head = newNode;
            }
            else{
                Node last = linkedList.head;
                while(last.next != null){
                    last = last.next;
                }
                last.next = newNode;
            }
        }

        public static void printList(LinkedList ll){
            Node currNode = ll.head;

            while(currNode != null){
                System.out.println(currNode.data + " ");
                currNode = currNode.next;
            }
        }
    }

    public static LinkedList.Node loopStarter(LinkedList loopList){
        HashMap<LinkedList.Node, Integer> hm = new HashMap<>();
        int count = 1;

        LinkedList.Node nodeLoop = null;
        LinkedList.Node currNode = loopList.head;

        while(currNode.next != null){
            if(hm.containsKey(currNode)){
                nodeLoop = currNode;
                break;
            }
            hm.put(currNode, count);
            currNode = currNode.next;

        }

        return nodeLoop;
    }
    public static void main(String[] args) {

        LinkedList linkedList = new LinkedList();

        //Nodes
        LinkedList.Node nodeA = new LinkedList.Node('A');
        LinkedList.Node nodeB = new LinkedList.Node('B');
        LinkedList.Node nodeC = new LinkedList.Node('C');
        LinkedList.Node nodeD = new LinkedList.Node('D');
        LinkedList.Node nodeE = new LinkedList.Node('E');

        //add to list
        LinkedList.insert(linkedList, nodeA);
        LinkedList.insert(linkedList, nodeB);
        LinkedList.insert(linkedList, nodeC);
        LinkedList.insert(linkedList, nodeD);
        LinkedList.insert(linkedList, nodeE);
        LinkedList.insert(linkedList, nodeC);


        System.out.println(loopStarter(linkedList).data);
    }
}
