import java.util.Scanner;

public class Wtfstar{
    public static void main (String[] avgs){//輸入
        int a=6,b=6;
        for(int row =1;row<=9;row++){
            for(int print = 1;print<=11;print++){
                if(print >b||print <a){
                    System.out.print("*");
                }
                else
                    System.out.print(" ");
                
            }
           System.out.println("");
            if(row>=5){
            a++;
            b--;}
            else{
            a--;
            b++;
            }
        }
         
    }
}