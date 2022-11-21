import java.util.Arrays;

public class SpecificPositionIntoArray {
    public static void main(String[] args) {
        int array[]={1,2,3,4,5,6,8,9};

        int Index_position=6;
        int newValue=7;
        System.out.println("Original array: "+ Arrays.toString(array));

        for(int i=array.length-1; i>Index_position; i--){
            array[i]=array[i-1];
        }
        array[Index_position]=newValue;
        System.out.println("New Array: " + Arrays.toString(array));
    }
}
