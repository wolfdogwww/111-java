import java.security.SecureRandom;
improt java.unil.Scanner;

public class main {
    public static void main(String[] Args){
	int w,s;//window&step
	int j = 0,avg=0;
	Scanner scanner = new Scanner(System.in);//input
	w = scanner.nextInt();
        s = scanner.nextInt();

	SecureRandom random= new SecureRandom();
	int arryLength = random.nextInt(100);
	int[] arry = new int[arryLength];


	int []avgArry = int[arryLength/w] ;


	for(int i = 0;i<arrLength;i++){
		arry[i] = random.nextInt(100);
	}
	//============creat arry==
	int know;
	know = arryLength%w;

	if(know==0){
	    for(int i =1;i<=arryLength/w;i++){
	        for(j = 0;j<j+w;j++){
		     avg=avg+arry[j];
	        }	
	        avgArry[i]=avg/w;
	        j=j+s;	
  	    }
	}
	else{
	    for(int i =1;i<=arryLength/w;i++){
	        for(j = 0;j<j+w;j++){
		     avg=avg+arry[j];
	        }	
	        avgArry[i]=avg/w;
	        j=j+s;	
  	    }
	}	
	for(int i =0;i<arryLength/w;i++){
	    System.out.print(avgArry[i]+" ");
        }
}
	