import java.util.Scanner;
public class Taxicount{
    public static void main (String[] avgs){//輸入
        int km,dollar=85;
		Scanner input = new Scanner(System.in);
		System.out.print("pls input your km count:");
		km = input.nextInt();
		if(km>7){
			dollar=(km-7)*5+85;
		}
		System.out.print(dollar);
			
    }
}