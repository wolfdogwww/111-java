public class WTFstarTeacher{
    public static void main (String[] avgs){//輸入
        for(int i =-4;i<=4;i++){
	   for(int k = -5;k<=5;k++){
	       if(Math.abs(k)+Math.abs(i)>4)
		   System.out.print("*");
		else 
		   System.out.print(" ");
	   }
		 System.out.println("");
	}


    }

}