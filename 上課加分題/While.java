*/
0
 1
  2
   3
    4
     5
      6
       7
        8
         9
*/
import java.util.Scanner;

public class While{
    public static void main (String[] avgs){//輸入
        int grade=0;
	int space=0;
        
        while(grade<10){
	    
	    while(space>0){
	        System.out.print(" ");
	        space--;
		}
	
            System.out.println(grade);
            grade++;
            space=grade;
	}
    }
}