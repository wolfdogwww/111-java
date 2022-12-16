public class CoolArry{
	public static void main(String[] Args){
		int bArr[] = {7,5,4,9,8,1,2},sort,max,min,mid,i;
		double average=0;
        for( i= 0;i<bArr.length;i++){
			for(int j = 1;j<bArr.length-i;j++){			    
				if(bArr[j-1]>bArr[j]){
					sort = bArr[j-1];
					bArr[j-1]=bArr[j];
					bArr[j]=sort;
				}
			}
		}
		for(i=0;i<bArr.length;i++)
			average=average+bArr[i];
		
		System.out.println("max:"+bArr[bArr.length-1]);
		System.out.println("min:"+bArr[0]);
		System.out.println("average:"+average/7);
		System.out.println("mid:"+bArr[bArr.length/2]);
	}
	
}