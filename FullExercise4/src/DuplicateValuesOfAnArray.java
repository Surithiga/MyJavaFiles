public class DuplicateValuesOfAnArray {
    public static void main(String[] args) {
        int num[]={9,8,7,3,9,7,6,5};
        for(int i=0; i<num.length; i++){
            for(int j=0; j<num.length; j++){
                if((num[i]==num[j]) &&(i!=j)){
                    System.out.println("duplicate value is: " + num[j]);
                }
            }
        }
    }
}
