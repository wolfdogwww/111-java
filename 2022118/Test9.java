public class Test9{
    public static void main (String[] args){
        int a ;
        int b=7;

        Test10 t10 = new Test10();
        a=t10.add(b,7);
        System.out.print(a);
    }

}

class Test10{

    public int add (int x,int y){
    int t = x+y;
    return t;
    } 
}