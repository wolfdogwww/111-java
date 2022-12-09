public class Sort02{//用3次找到2
	public static void main(String[] args){
		int bArr[] = {10,9,8,7,6,5,4,3,2,1,0};
		int find=2,count=0,ture=0;
		
		while(ture==1){
			for(int i =0;i<bArr.length;i++){
				if(find%2==bArr[i]%2){
				    if(bArr[i]/find==0){
						count++;
						ture=1;
						System.out.println("["+i+"]=2");
						System.out.print(count);
					}					
				}
			}
			System.out.print(count);
		}
		

	}
}