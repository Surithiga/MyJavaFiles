public class Exercise6 {
    public static void main(String[] args) {
        int s,n,count;
        System.out.println("enter the value of 1 to 500 are: ");
        for(s=0; s<=500; s++){
            count=0;
            for(n=1; n<=s; n++){
                if(s % n==0){
                    count++;
                }
            }
            if(count==2){
                System.out.println(s+"");
            }
        }
    }
}
