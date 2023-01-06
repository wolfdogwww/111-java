public class main {
    public static void main(String[] Args){
	int x =10;    
	double y = 10.0;
	System.out.println("x"+setV(x));
	System.out.println("x,y"+setV(x,3));
	System.out.println("y"+setV(y));
    }
    public static int setV(int x){
	return x = 20;
    }
    public static int setV(int x,int y){
	return x = 40;
    }
    public static double setV(double x){
	return x = 30.0;
    }

}