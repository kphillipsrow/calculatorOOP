package com.company;

import java.util.Scanner;

class Main
{
    public static void main(String[] args)
    {
        Scanner reader = new Scanner(System.in);

        System.out.println("Input first number: ");
        double num1 = reader.nextDouble(); //first number

        System.out.println("Input second number: ");
        double num2 = reader.nextDouble(); //second number

        Calculator my_calc = new Calculator(num1 ,num2); //creates new object, passes in numbers

        System.out.println("Which operation would you like to do?");

        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");

        int choice = reader.nextInt(); //choice input

        if(choice == 1) //addition
        {
            double add_output = my_calc.addition(num1, num2);
            System.out.println("Answer: " + add_output);
        }

        else if(choice == 2) //subtraction
        {
            double subtract_output = my_calc.subtraction(num1,num2);
            System.out.println("Answer: " + subtract_output);
        }

        else if(choice == 3) //multiplication
        {
            double multiply_output = my_calc.multiplication(num1,num2);
            System.out.println("Answer: " + multiply_output);
        }

        else if(choice == 4)
        {
            double divide_result = my_calc.divide(num1, num2);
            System.out.println("Answer: " + divide_result);
        }

        else
        {
            System.out.println("That is not a valid input");
        }
    }
}
