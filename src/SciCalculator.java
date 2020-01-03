package com.company;
import java.util.Scanner;

public class SciCalculator {


    public static void main(String[] args) {
        double operand1;                            //first integer
        double operand2;                            //second integer
        double currentResult;                       //result that will display at the top of the main menu
        double sumOfCalc;                           //sum of all final calculations
        double average;                             //average of the sum of all calculations
        int numOfCalc;                              //the number of calculations user has made
        int operation;                              //menu selection
        String Operation;
        boolean calculate = true;
        Scanner scnr = new Scanner(System.in);

        operation = 0;
        currentResult = 0;
        sumOfCalc = 0;
        numOfCalc = -1;

        while (calculate) {
            System.out.println("Current Result: " + currentResult);     //displays the total for the calculation
            System.out.println("");
            numOfCalc++;
            sumOfCalc = sumOfCalc + currentResult;                      //adds up the total for the average function

            System.out.println("Calculator Menu");                      //this entire section is the display menu
            System.out.println("---------------");                      //each line is for the text that will be
            System.out.println("0. Exit Program");                      //displayed when prompting the user to perform
            System.out.println("1. Addition");                          //a function
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Exponentiation");
            System.out.println("6. Logarithm");
            System.out.println("7. Display Average");
            System.out.println("");
            System.out.println("Enter Menu Selection: ");



            operation = scnr.nextInt();



            while (operation == 7){                                     //this section is for the average function
                if (numOfCalc > 0) {
                average = sumOfCalc / numOfCalc;                        //performs average
                System.out.println("Sum of calculations: " + sumOfCalc);
                System.out.println("Number of calculations: " + numOfCalc);
                System.out.print("Average of calculations: ");
                System.out.printf("%.2f", average);
                System.out.println("");
                System.out.println("");
                System.out.println("Enter Menu Selection: ");           //gives user next menu option
                operation = scnr.nextInt();
            }
                else {
                    System.out.println("Error: No calculations yet to average!");   //error if no calculations have been
                    System.out.print("Enter Menu Selection: ");                     //made before using average
                    operation = scnr.nextInt();
                }
            }
            while (operation < 0 || operation > 7) {
                System.out.println("Error: Invalid selection!");        //error if user selects function that is not
                System.out.println("");                                 //included on the main menu
                System.out.println("Enter Menu Selection: ");
                operation = scnr.nextInt();
            }
            if (operation == 0) {                                                 //exits calculator
                break;
            }
            if (operation == 1) {
                System.out.println("Enter first operand: ");
                operand1 = scnr.nextDouble();                                   //user enters first operand

                System.out.println("Enter second operand: ");
                operand2 = scnr.nextDouble();                                   //user enters second operand
                currentResult = operand1 + operand2;                            //performs addition
            }
            if (operation == 2) {
                System.out.println("Enter first operand: ");
                operand1 = scnr.nextDouble();                                    //user enters first operand

                System.out.println("Enter second operand: ");
                operand2 = scnr.nextDouble();                                    //user enters second operand
                currentResult = operand1 - operand2;                             //performs subtraction
            }
            if (operation == 3) {
                System.out.println("Enter first operand: ");
                operand1 = scnr.nextDouble();                                    //user enters first operand

                System.out.println("Enter second operand: ");
                operand2 = scnr.nextDouble();                                    //user enters second operand
                currentResult = operand1 * operand2;                             //performs multiplication
            }
            if (operation == 4) {
                System.out.println("Enter first operand: ");
                operand1 = scnr.nextDouble();                                   //user enters first operand

                System.out.println("Enter second operand: ");
                operand2 = scnr.nextDouble();                                   //user enters second operand
                currentResult = operand1 / operand2;                            //performs division
            }
            if (operation == 5) {
                System.out.println("Enter first operand: ");
                operand1 = scnr.nextDouble();                                   //user enters first operand

                System.out.println("Enter second operand: ");
                operand2 = scnr.nextDouble();                                   //user enters second operand
                currentResult = Math.pow(operand1, operand2);                   //operand1 to the (operand2)th power
            }
            if (operation == 6) {
                System.out.println("Enter first operand: ");
                operand1 = scnr.nextDouble();                                   //user enters first operand

                System.out.println("Enter second operand: ");
                operand2 = scnr.nextDouble();                                   //user enters second operand
                currentResult = (Math.log(operand2) / Math.log(operand1));      //log base(operand 1) of operand2
            }



        }



        System.out.print("Thanks for using this calculator. Goodbye!");         //goodbye message
    }
}