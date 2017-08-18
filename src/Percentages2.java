/**
 * Created by jc317912 on 18/08/17.
 */
import java.util.Scanner;
public class Percentages2 {
    public static void main (String[] args){
        double num1 = getNum();
        double num2 = getNum();
        computePercent(num1,num2);
    }
    public static void computePercent(double num1, double num2){
        double percent = ((num1 / num2)*100);
        System.out.println(num1+ " is " +percent+ " percent of " +num2);
    }
    public static double getNum (){
        double num;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter an Number: ");
        num = input.nextInt();
        return num;
    }
}
