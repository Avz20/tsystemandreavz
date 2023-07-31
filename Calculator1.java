package com.tsystems.javaschool.tasks.calculator;

import java.util.Scanner;
// import org.junit.Ignore;

// @ignore
public class CalculatorTest {

	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
	    System.out.println("Arithmetic expressions. Type HELP to see all available operations and EXIT to quit");
	    String operation = teclado.next();
	     
	    while(!operation.equals("EXIT") )
	    {
	        if(operation.equals ("SUM"))
	        {
	            System.out.println("type a number");
	            int num1= teclado.nextInt();
	            System.out.println("type another number");
	            int num2= teclado.nextInt();
	            int sum = 0;
	            sum = num1 + num2;
	            System.out.println("The sum is " + num1 + "+" + num2 + "=" + sum);
	        }
	        else if(operation.equals ("RES"))
	        {
	            System.out.println("type a number");
	            int num1= teclado.nextInt();
	            System.out.println("type another number");
	            int num2= teclado.nextInt();
	            int res = 0;
	            res = num1 - num2;
	            System.out.println("The substraction is " + num1 + "-" + num2 + "=" + res);
	        }
	        else if(operation.equals ("MUL"))
	        {
	            System.out.println("type a number");
	            int num1= teclado.nextInt();
	            System.out.println("type another number");
	            int num2= teclado.nextInt();
	            int mult = 0;
	            mult = num1 * num2;
	            System.out.println("The multiplication is " + num1 + "*" + num2 + "=" + mult);
	        }
	        else if(operation.equals("DIV"))
	        {
	            System.out.println("type a number");
	            int num1= teclado.nextInt();
	            System.out.println("type another number");
	            int num2= teclado.nextInt();
	            int div = 0;
	            div = num1 / num2;
	            System.out.println("The division is " + num1 + "/" + num2 + "=" + div);
	        }
	        else if(operation.equals("P"))
	        {
	            System.out.println("type a number");
	            int num1= teclado.nextInt();
	            System.out.println("type another number");
	            int num2= teclado.nextInt();
	            double pot = Math.pow(num1,num2);
	            System.out.println("The power (exponentiation) of "+ num1 + "is " + pot);
	        }
	        else if(operation.equals("C"))
	        {
	            System.out.println("type a number");
	            int num1= teclado.nextInt();
	            double cuadrada = Math.sqrt(num1);
	            System.out.println("The square root of " + num1 + " is " + cuadrada);
	        }
	        else if(operation.equals("MM"))
	        {
	            System.out.println("type a number");
	            int num1= teclado.nextInt();
	            System.out.println("type another number");
	            int num2= teclado.nextInt();
	            if(num1>num2){
	                System.out.println("The greatest number is " + num1);                    
	            } else if (num1<num2){
	                System.out.println("The greatest number is " + num2);
	            } else {
	            	System.out.println("Both numbers are the same");
	            }
	        }
	        else if (operation.equals("HELP"))
	        {
	            System.out.println("Type: \n SUM to Addition \n RES to Substraction \n MUL to Multiplication \n DIV to Division \n P to Power (Exponentiation) \n C to Square Root \n MM to Compare and find the Greater and Smaller numbers");
	                
	        }
	        
	        else 
	        {
	            System.out.println("unknown command, type HELP to see the available operations");
	        }
	        operation = teclado.next();
	        
	    }
	     System.out.println("The calculator has been turned off");
	     teclado.close();
	
		}

}