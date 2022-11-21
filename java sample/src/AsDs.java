public class AsDs {
    public static void main(String[] args){
        int[] numbers=new int[] {22,45,54,98,76,90,51,12,32};
        int value;
        for(int i=0;i<numbers.length;i++){
            for(int j=0; j<numbers.length;j++){
                if(numbers[i]>numbers[j]){
                    value=numbers[i];
                    numbers[i]=numbers[j];
                    numbers[j]=value;
                }
            }
        }
        for(int a:numbers){
            System.out.println("the ascending number is:"+a);
        }
    }
}
