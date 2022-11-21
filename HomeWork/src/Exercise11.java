public class Exercise11 {
    public static void main(String[] args) {
        int[] numbers={ 1, 2, 3, 3, 4, 4, 3, 5, 7, 6, 3, 4};
        int element = 3;
        int index = 0;

        for(int i=0; i<numbers.length; i++){
            if(numbers[i]==element){
                index = i;
                System.out.println("Index of " + element + " is: " + index);
            }
        }

    }
}
