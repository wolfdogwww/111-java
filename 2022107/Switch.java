import java.util.Scanner;

public class Switch{
    public static void main (String[] avgs){//輸入
        int grade;
        
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first integer: ");
        grade = input.nextInt();
 
        
        switch(grade){
	    case 90:
		System.out.println('A');
		break;
	    case 80:
	        System.out.println('B');
		break;
	    case 70:
		System.out.println('C');
		break;
	    case 60:
	        System.out.println('D');
		break;
	    default:
                System.out.println("你考得很爛ㄟ");}


}
}
