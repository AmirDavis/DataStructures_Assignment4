// Name: Amir Davis
// Class: CS 3305/Section# 04
// Term: Spring 2022
// Instructor: Dr. Haddad
// Assignment: 4

import java.util.Scanner;

public class RadixSort {
    public static void main(String[] args){
        int inputsLength; //holds the array length
        int returnValue;
        Character userDecision = 'N';

        Scanner myScanner = new Scanner(System.in);

        //Need 10 queues for radix sort
        Queue Queue0 = new Queue();
        Queue Queue1 = new Queue();
        Queue Queue2 = new Queue();
        Queue Queue3 = new Queue();
        Queue Queue4 = new Queue();
        Queue Queue5 = new Queue();
        Queue Queue6 = new Queue();
        Queue Queue7 = new Queue();
        Queue Queue8 = new Queue();
        Queue Queue9 = new Queue();

        do{
            int numToDivideBy = 1; //used for the extract digit method
            System.out.print("How many inputs: ");
            inputsLength = myScanner.nextInt();
            int[] inputs = new int[inputsLength];

            System.out.print("Input numbers: ");
            for(int i = 0; i < inputsLength; i++){
                inputs[i] = myScanner.nextInt();
            }

            System.out.print("Inputs array before sorting: ");
            //prints out the user's inputs
            for(int i = 0; i < inputsLength; i++){
                if(i == inputsLength - 1){
                    System.out.println(inputs[i]);
                }else{
                    System.out.print(inputs[i] + ", ");
                }
            }

            while(numToDivideBy < 1000000){
                for(int i = 0; i < inputs.length; i++){

                    //calls the ExtractDigit method for the current value of inputs at i
                    returnValue = ExtractDigit(inputs[i], numToDivideBy);
                    //Depending on the returnValue, adds that current value of inputs at i to the queue to. For example, if the
                    //returnValue were to be 8, the switch case would enqueue the current value of inputs[i] to queue8
                    switch (returnValue){
                        case 0:
                            Queue0.enqueue(inputs[i]);
                            break;
                        case 1:
                            Queue1.enqueue(inputs[i]);
                            break;
                        case 2:
                            Queue2.enqueue(inputs[i]);
                            break;
                        case 3:
                            Queue3.enqueue(inputs[i]);;
                            break;
                        case 4:
                            Queue4.enqueue(inputs[i]);
                            break;
                        case 5:
                            Queue5.enqueue(inputs[i]);
                            break;
                        case 6:
                            Queue6.enqueue(inputs[i]);
                            break;
                        case 7:
                            Queue7.enqueue(inputs[i]);
                            break;
                        case 8:
                            Queue8.enqueue(inputs[i]);
                            break;
                        case 9:
                            Queue9.enqueue(inputs[i]);
                            break;
                    }
                }
                int index = 0;

                //Checks to see if the queue is empty first. Then, if there are values present in the queue, it will dequeue
                //those values and them the inputs array, basically rearranging the array until it is sorted from least to greatest.
                //This is the case for the while loops from lines 95-139)
                while(!Queue0.isEmpty()){
                    inputs[index] = (Integer)Queue0.dequeue();
                    if(index == inputsLength){
                        break;
                    }
                    else{
                        index++;
                    }
                }
                while(!Queue1.isEmpty()){
                    inputs[index] = (Integer)Queue1.dequeue();
                    index++;
                }
                while(!Queue2.isEmpty()){
                    inputs[index] = (Integer)Queue2.dequeue();
                    index++;
                }
                while(!Queue3.isEmpty()){
                    inputs[index] = (Integer)Queue3.dequeue();
                    index++;
                }
                while(!Queue4.isEmpty()){
                    inputs[index] = (Integer)Queue4.dequeue();
                    index++;
                }
                while(!Queue5.isEmpty()){
                    inputs[index] = (Integer)Queue5.dequeue();
                    index++;
                }
                while(!Queue6.isEmpty()){
                    inputs[index] = (Integer)Queue6.dequeue();
                    index++;
                }
                while(!Queue7.isEmpty()){
                    inputs[index] = (Integer)Queue7.dequeue();
                    index++;
                }
                while(!Queue8.isEmpty()){
                    inputs[index] = (Integer)Queue8.dequeue();
                    index++;
                }
                while(!Queue9.isEmpty()){
                    inputs[index] = (Integer)Queue9.dequeue();
                    index++;
                }
                numToDivideBy *= 10; //increases the variable numToDivideBy, so we can get the next digit
            }

            //prints out the contents of array inputs after the numbers are sorted
            System.out.print("Inputs array after sorting: ");
            for(int i = 0; i < inputsLength; i++){
                if(i == inputsLength - 1){
                    System.out.println(inputs[i]);
                }else{
                    System.out.print(inputs[i] + ", ");
                }
            }

            System.out.print("Would you like to go again (Y/N): ");
            userDecision = myScanner.next().charAt(0); //reads the user's decision for if they want to execute the program again
            userDecision = Character.toUpperCase(userDecision); //changes the user's response to uppercase
        }while(userDecision != 'N');
    }

    //This method is used to extract the last digit of a number, and then return that digit. Used to
    //know which queue to add the number from the digit to
    public static int ExtractDigit(int num, int numToDivideBy){
        int x = num;
        x /= numToDivideBy;
        x %= 10;
        return x;
    }
}
