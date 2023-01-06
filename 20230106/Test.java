public class main {
    public static void main(String[] Args){
	int[] arr = {1,2,3,4,5,6,7,8,9};
	int x =10;    
		
	setVariable(x);
	System.out.print(x);
	
	setArry(arr);
	for(int i :arr)
	    System.out.println(i);
    }

    public static void setVariable(int x ){
	x=20;    
    }
    public static void setArry(int arr[]){
	arr[0]=2000000;  
    }
}