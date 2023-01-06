public class main {
    public static void main(String[] Args){
	int x =10;    
	int y = x;
	y=20;
	System.out.println("x:"+x);
	System.out.println("y:"+y);

	int[] arr = {1,2,3,4,5,6,7,8,9};
	int[] arr2 = arr;

	arr2[0]=2000;
	
	System.out.println("arr[0]"+arr[0]);
	System.out.println("arr2[0]"+arr2[0]);

    }
}