import java.util.Scanner;

public class star04{
    public static void main (String[] avgs){//輸入
        int row=0,blank=4,star=0,col;
        
        while(row<=9){
			col=0;	
			
				while(col<blank){
					System.out.print(" ");
					col+=1;        
		}
	    col = 0;
	    while(col<=star){
			System.out.print("*");
			col++;
		}
		System.out.println("");
		if(row<4){
			blank--;
			star+=2;
		}
		else{
			blank++;
			star-=2;
	    }
	    row++;
		}
    }
}