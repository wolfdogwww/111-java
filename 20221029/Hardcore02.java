import java.util.Scanner;

public class Hardcore02{
    public static void main (String[] avgs){//輸入
        int num=1;
		for(int i=0 ;i<6;i++)
		{
			num=1;
			for(int j=1;j<=6;j++)
			{
				if(j<=5-i)
					System.out.print("*");
				else{
					System.out.print(j-(5-i));
					
				}
			}
			System.out.println("");
			
		}	
    }
}