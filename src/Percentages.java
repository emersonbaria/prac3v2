/**
 * Created by jc317912 on 18/08/17.
 */
public class Percentages {
    public static void main (String[] args){
        double num1 = 2.0;
        double num2 = 5.0;
        computePercent(num1,num2);
    }
    public static void computePercent(double num1, double num2){
        double percent = ((num1 / num2)*100);
        System.out.println(num1+ " is " +percent+ " percent of " +num2);
    }
}
