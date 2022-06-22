// Name: Amir Davis
// Class: CS 3305/Section# 04
// Term: Spring 2022
// Instructor: Dr. Haddad
// Assignment: 4

public class Queue<e> {
    private Node head, tail;
    private int size; //to keep track of the size of thr queue

    public Queue(){
        head = null;
        size = 0;
    }

    //adds object to queue. If the queue is empty, the head ____ the ____. If the queue is not empty, the head value is
    //pushed back and gains_____
    public void enqueue(e element){
        Node newNode = new Node(element);
        if(isEmpty()){
            head = newNode;
            tail = newNode;
        }
        else{
            tail.next = newNode;
            tail = newNode;
        }
        size++;
    }

    public void addLast(e data){
        if (tail == null)
            head = tail = new Node(data); //empty list
        else
        {
            tail.next = new Node(data); //link new node as last node
            tail = tail.next; //make tail pointer points to last node
        }
    }

    //removes top object from queue. If the queue is empty, method will return null
    public e dequeue(){
        if(isEmpty()){
            System.out.print("Queue is empty");
            return null;
        }
        else{
            size--;
            Node temp = head;
            head = head.next;
            return temp.data;
        }
    }

    //returns the top element of the queue
    public void frontElement(){
        System.out.print("Head: " + head.data);
    }

    //returns the size of the queue
    public int getSize() {
        return size;
    }

    //Returns if the Queue is empty or not
    public boolean isEmpty(){
        if (size == 0){
            return true;
        }
        else{
            return false;
        }
    }

    //Prints out the contents of the Queue
    public void printQueue(){
        Node current = head;
        while(current != null){
            System.out.print(current.data + " ");
            current = current.next;
        }
    }

    public class Node{
        private e data;
        private Node next;

        private Node(e element){
            data = element;
            next = null;
        }
    }
}
