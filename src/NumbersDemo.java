/**
 * Created by jc317912 on 18/08/17.
 */
public class NumbersDemo
{
    public static void main (String[] args)
    {
        int num1 = 1;
        int num2 = 2;
        displayTwiceTheNumber(num1,num2);
        displayNumberPlusFive(num1, num2);
        displayNumberSquared(num1, num2);
    }

    public static void displayTwiceTheNumber(int a, int b){
        int newNumA=a+a;
        int newNumB=b+b;
        System.out.println("Twice of "+a+" is " +newNumA + " , and twice of "+b+" is " + newNumB);
    }
    public static void displayNumberPlusFive(int a, int b){
        int newNumA=a+5;
        int newNumB=b+5;
        System.out.println("Adding 5 to "+a+" is " +newNumA + " , and 5 plus "+b+" is " + newNumB);
    }
    public static void displayNumberSquared(int a, int b){
        int newNumA=a*a;
        int newNumB=b*b;
        System.out.println("Square of "+a+" is " +newNumA + " , and Square of "+b+" is " + newNumB);
    }
}
