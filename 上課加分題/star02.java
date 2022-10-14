public class star02{
    public static void main (String[] avgs){//輸入
	int row=0,b=0,a=0,count=0;
	    while(row<9){a=0;while(a<=b){
		System.out.print("*");
		a++;
	    }
	    row++;
	    System.out.println();
	    count=row>=5?b--:b++;
}
}
}
	
	/*
	
        while(row<5){
			int a=0;
			while(a<=row){
				System.out.print("*");
				a++;
			}
			row++;
			System.out.println("");
		}
			
		while(row<=9){
			int a=8;
			while(a>=row){
				System.out.print("*");
				a--;
			}
			row++;
			System.out.println("");
		
		*/
