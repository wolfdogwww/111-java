//Switch v0.3
import java.util.Scanner;

public class Switch3{
    public static void main (String[] avgs){//輸入
        int grade;
        
        Scanner input = new Scanner(System.in);
        System.out.print("請輸入你的成績(只能輸入0~100喔!)：");
        grade = input.nextInt();
 	
	while(grade>100||grade<0){  //防呆
	    System.out.println("手有問題嗎?");
	    System.out.print("再輸入一次：");
	    grade = input.nextInt();
         }	

	switch(grade/10){
	    case 10:
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
