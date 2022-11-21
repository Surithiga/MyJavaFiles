public class CommonElementsBetweenTwoArrays {
    public static void main(String[] args) {
        int array1[]={0,1,2,3,4};
        int array2[]={9,7,8,0,1};

        for(int i=0; i<array1.length; i++){
            for(int j=0; j<array2.length; j++){
                if(array1[i]== (array2[j])){
                    System.out.println("common element of array is:" + array1[i]);
                }
            }
        }
    }
}
