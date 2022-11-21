public class PrimeNumBetween1To20 {
    public static void main(String[] args) {
        int i, j, count;
        System.out.println("prime numbers between 1 to 20 are: ");
        for(i=2; i<=20; i++){
            count=0;
            for(j=1; j<=i; j++){
                if(i % j==0){
                    count++;
                }
            }
            if(count==2)
                System.out.println(i +" ");
        }
    }
}
