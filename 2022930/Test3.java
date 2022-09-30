import java.util.Scanner;
public class Test{
    public static void main (String[] avgs){//輸入
        int num1;
        int num2;
        int sum;
        
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first integer: ");
        num1 = input.nextInt();
        
        System.out.print("Enter second integer: ");
        num2 = input.nextInt();
        
        sum = num1+num2;
        System.out.println("the sum is "+ sum);
        
    }

    public static void printStr (int str){//輸入
        System.out.println(str); //輸出
    }
}