//Switch v0.2
import java.util.Scanner;

public class Switch{
    public static void main (String[] avgs){//輸入
        int grade;
        
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first integer: ");
        grade = input.nextInt();
 
        
        switch(grade/10){
	    case 9:
		System.out.println('A');
		break;
	    case 8:
	        System.out.println('B');
		break;
	    case 7:
		System.out.println('C');
		break;
	    case 6:
	        System.out.println('D');
		break;
	    default:
                System.out.println("你考得很爛ㄟ");}


}
}
