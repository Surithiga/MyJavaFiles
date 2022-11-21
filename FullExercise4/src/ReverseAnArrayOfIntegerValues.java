public class ReverseAnArrayOfIntegerValues {
    public static void main(String[] args) {
        int num[]={10,20,30,40,50,60,70};
      // for(int i=0; i<num.length; i++){
        // System.out.println(num[i] + " ");
        //}
       for(int i= num.length-1; i>=0;  i--){
           System.out.println(num[i] + " ");
       }
    }

}
