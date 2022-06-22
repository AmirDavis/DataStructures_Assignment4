// Name: Amir Davis
// Class: CS 3305/Section# 04
// Term: Spring 2022
// Instructor: Dr. Haddad
// Assignment: 4

import java.util.Scanner;

public class TestQueue<e> {
    public static void main(String[] args){
        int optionNumber;
        Object element;

        Queue<Object> testQueue = new Queue<>(); //creates a new queue

        Scanner optionNumberScanner = new Scanner(System.in);
        Scanner elementScanner = new Scanner(System.in);

        do{
            printMenu(); //displays the menu
            optionNumber = optionNumberScanner.nextInt(); //reads user's input for which

            //Switch case for user's decision.
            switch (optionNumber){
                case 1:
                    System.out.print("What would you like to push to the Queue: ");
                    element = elementScanner.next();
                    System.out.print("Queue before enqueueing " + element + ": ");
                    testQueue.printQueue();
                    System.out.print("\nQueue after enqueueing " + element + ": ");
                    testQueue.enqueue(element);
                    testQueue.printQueue();
                    break;
                case 2:
                    System.out.print("Queue before deque: ");
                    testQueue.printQueue();
                    System.out.print("\nQueue after dequeing: " );
                    testQueue.dequeue();
                    testQueue.printQueue();
                    break;
                case 3:
                    testQueue.frontElement();
                    break;
                case 4:
                    System.out.println("The size of the queue is: " + testQueue.getSize());
                    break;
                case 5:
                    System.out.println("Is queue empty: " + testQueue.isEmpty());
                    break;
                case 6:
                    System.out.print("Contents in queue: ");
                    testQueue.printQueue();
                    break;
                case 7:
                    break;
                default:
                    System.out.print("Invalid input. Please input a valid number: ");
                    optionNumber = optionNumberScanner.nextInt();
            }
        }while(optionNumber != 7);

    }

    public static void printMenu(){
        System.out.print("\n--------MAIN MENU--------\n" +
                           "1 – Enqueue element\n" +
                           "2 – Dequeue element\n" +
                           "3 – Front element\n" +
                           "4 – Size of queue\n" +
                           "5 – Is Empty queue?\n" +
                           "6 - Print queue content\n" +
                           "7 - Exit program\n\n" +
                           "Enter option number: ");
    }
}
