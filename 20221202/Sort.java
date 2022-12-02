public class Sort{
	public static void main(String[] args){
		int bArr[] = {5,9,4,3,6};
		int sort;
		
		for(int i = 0;i<bArr.length;i++){
			for(int j = 1;j<bArr.length-i;j++){
			    
				if(bArr[j-1]>bArr[j]){
					sort = bArr[j-1];
					bArr[j-1]=bArr[j];
					bArr[j]=sort;
				}
					
			}		
		}
		for(int a=0;a < bArr.length;a++)
			System.out.print(bArr[a]);
	}
}