import java.util.Scanner;

public class star03{
    public static void main (String[] avgs){//輸入
        int row=0,count;
        
        while(row<5){
			int b=4;
				while(b>row){
					System.out.print(" ");
						b--;           
		}
	    int a=0;
	    while(a<=row*2){
			System.out.print("*");
			a++;
		}
	    row++;
	    System.out.println("");
	    
		}
    }
}