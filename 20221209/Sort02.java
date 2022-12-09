public class Sort02{
	public static void main(String[] args){
		int bArr[] = {0,1,2,3,4,5,6,7,8,9,10};
		int find=2,count=0;
		
		for(int i = 0;i<bArr.length;i++){
			count++;
			if(bArr[i]/find==1&&bArr[i]%find==0){
				System.out.println("["+i+"]=2");
				System.out.print(count);
			}
		}

	}
}