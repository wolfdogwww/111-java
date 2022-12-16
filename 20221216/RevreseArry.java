public class RevreseArry{
	public static void main(String[] Args){
		int temp;
		int[] data = {7,5,4,8,1,2};
                System.out.println("Before:");
		for(int j=0;j<data.length;j++){
		    System.out.print(data[j]+"\t");
		}
		System.out.println("");
                for(int i=0;i<data.length/2;i++){
                    temp=data[i];
		    data[i]=data[data.length-i-1];
		    data[data.length-i-1]=temp;
                }
		System.out.println("After:");
		for(int j=0;j<data.length;j++)
		    System.out.print(data[j]+"\t");
	}
	
}