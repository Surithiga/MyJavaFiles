public class UniqueElementInAnArray {
    public static void main(String[] args) {
        int num[]={1,2,3,4,5,1,2,3,4,5,6,7,8};

        for(int i=0; i<num.length; i++){
            int count1=0;
            for(int j=0; j<num.length; j++){
                if(num[i]==num[j]){
                    count1++;
                }
            }
            if(count1==1){
                System.out.println(num[i] +" ");
            }
        }
    }
}
