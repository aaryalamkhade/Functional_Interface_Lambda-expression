
package lmabdacalculator;
import java.util.*;
public class LmabdaCalculator 
{
public static int performCalculation(int operan1, int operan2,String operato, CalculatorFace calculator)
{  
  return calculator.calculate(operan1,operan2,operato);
}
    public static void main(String[] args) 
    {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the first operand:");
    int operand121=sc.nextInt();
    System.out.println("Enter the operator:");
    String operator123=sc.next();
    System.out.println("Enter the second operand:");
    int operand122=sc.nextInt();
   
    
    if(operator123.equals("+"))
    {
                CalculatorFace addition = (operand1,operand2,operator) -> operand1 + operand2;
		System.out.println("Addition of two numbers:" + performCalculation(operand121, operand122,operator123, addition));
    }
    else if(operator123.equals("-"))
    {
                CalculatorFace subtraction = (operand1,operand2,operator) -> operand1 - operand2;
		System.out.println("subtraction of two numbers:" + performCalculation(operand121, operand122,operator123, subtraction));
    }
    else if(operator123.equals("*"))
    {
                CalculatorFace Multiplication = (operand1,operand2,operator) -> operand1 * operand2;
		System.out.println("Multiplication of two numbers:" + performCalculation(operand121, operand122,operator123, Multiplication));
    }
    else if(operator123.equals("/"))
    {         
        if(operand122==0)
        {
             System.out.println("Divide by 0 Invalid input");
        }
        else
        {
            CalculatorFace Division = (operand1,operand2,operator) -> operand1 / operand2;
	    System.out.println("Division of two numbers:" + performCalculation(operand121, operand122,operator123, Division));
        }
                
    }
    else
    {
                System.out.println("Invalid Operator");
    }
    
}
}
interface CalculatorFace 
{
    public int calculate(int operand1,int operand2, String operator);
}

/*
Output:

Enter the first operand:
10
Enter the operator:
+
Enter the second operand:
-78
Addition of two numbers:-68



Enter the first operand:
45
Enter the operator:
-
Enter the second operand:
10
subtraction of two numbers:35


Enter the first operand:
10
Enter the operator:
*
Enter the second operand:
20
Multiplication of two numbers:200


Enter the first operand:
10
Enter the operator:
/
Enter the second operand:
5
Division of two numbers:2

Enter the first operand:
10
Enter the operator:
/
Enter the second operand:
0
Divide by 0 Invalid input



*/