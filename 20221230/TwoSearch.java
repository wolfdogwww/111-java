public class TeacherSearch{
    public static void main(String[] Args){
		int[] arrs={10,9,8,7,6,5,4,3,2,1,0};
		int right=arrs.length-1,left=0,mid=0,count=0;
		int target =2;
		
		while(arrs[mid]!=target){
			
			mid = (right+left)/2;
			if(arrs[mid]==target)
				break;
			if(arrs[mid]>=target){
				left=mid;
				count++; 
			}		
			else {
				right=mid;
			    count++;
			}
		}
		System.out.println("position:"+mid);
		System.out.print("count:"+count);
    }
}