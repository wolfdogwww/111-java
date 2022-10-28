public class bb {

    public static void main(String[] args) {
        int sw = 0;
        int[] str = new int[6];
        for(int i=0;i<str.length;i++) {
            str[i]=(int)(Math.random()*100);
            System.out.print(str[i]+" ");
        }
        System.out.print("\n");

        for(int i=str.length;i>=0;i--) {
            for(int j=0;j<i-1;j++) {
                if(str[j]>=str[j+1]) {
                    sw=str[j];
                    str[j]=str[j+1];
                    str[j+1]=sw;
                }
            }
        }
        for(int i=0;i<str.length;i++) {
            System.out.print(str[i]+" ");
        }
    }

}