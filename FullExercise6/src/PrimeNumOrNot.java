public class PrimeNumOrNot {
    public static void main(String[] args) {
        int num= 7;
        boolean b= false;

        for(int i=2; i<=num/2; i++){
            if(num % 2==0){
                b= true;
                break;
            }
        }
        if(!b){
            System.out.println(num + " it is prime number");
        }
        else{
            System.out.println(num + " it is a not prime number");
        }
    }
}
