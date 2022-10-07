import java.util.Scanner;

public class IF{
    public static void main (String[] avgs){//輸入
        int num1;
        
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first integer: ");
        num1 = input.nextInt();
 
        if(num1>=90){
            System.out.println("A");
        }
        else if(num1>=80){
            System.out.println("B");
        }
        else if(num1>=70){
            System.out.println("C");
        }   
        else if(num1>=60){
            System.out.println("D");
        }
        else {
            System.out.println("你媽知道你考這樣嗎?");
            
        /*if(num1>=60) //ㄐㄅ在不加大誇號的下場就是降
            if(num1>=70)
                System.out.println("g");
        
        else 
            System.out.print("b");*/
    //javac -econding UTD-8 xxx.java
}
}
}

 
       
        
        