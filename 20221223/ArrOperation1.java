import java.util.Scanner;
public class ArrOperation1 {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        int myArr[] ={7,5,4,9,8,1,2};
        int[] flag={0,0,0,0,0,0,0};
        int [] flag_arr = new int[myArr.length];
        int flag_count = 1;

    //find med ------------------------------------
        int med = 0;
		int a = 0;
		a=input.nextInt();
        for (int i =0 ; i<a;i++){
            int flag_min = 1000;
            int flag_min_index = 0;
            for(int j = 0; j<myArr.length;j++){
                if(myArr[j] < flag_min && flag[j] == 0){
                    flag_min = myArr[j];
                    flag_min_index = j ;
                        
                }
            }
                flag[flag_min_index] = flag_count;
                flag_count++;
                med = myArr[flag_min_index];
                    
            }
    //            ------------------------------------    
                System.out.println("Output:"+med);
            
    }
}