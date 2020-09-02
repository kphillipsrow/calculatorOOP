package com.company;

public class Calculator
{
    double x1;
    double x2;

    public Calculator(double num1, double num2) //constructor
    {
        x1 = num1;
        x2 = num2;
    }
    public double addition (double num1, double num2)
    {
        double add_result = num1 + num2;
        return add_result;
    }

    public double subtraction (double num1, double num2)
    {
        double subtract_result = num1 - num2;
        return subtract_result;
    }

    public double multiplication (double num1, double num2)
    {
        double multiply_result = num1 * num2;
        return multiply_result;
    }

    public double divide (double num1, double num2)
    {
        double divide_result = num1 / num2;
        return divide_result;
    }
}

