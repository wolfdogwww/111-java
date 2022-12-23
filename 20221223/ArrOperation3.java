import java.util.Scanner;
public class ArrOperation1 {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        float myArr[] ={7,5,4,9,8,1,2};
		float av;
		int i=0,a=0;
		if(myArr.length%2==0){
			for(i=0;i<=(myArr.length-1)/2;i=i++){
				av=(myArr[i]+myArr[i+1])/2;
				System.out.println(av);
			}
		}
		else{
			for(i=0;i<myArr.length/2;i++){		
				av=(myArr[a]+myArr[a+1])/2;
				System.out.println(av);
				a=a+2;
			}
			System.out.println(myArr[a]);
			
		}
                
            
    }
}