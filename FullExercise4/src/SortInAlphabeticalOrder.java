public class SortInAlphabeticalOrder {
    public static void main(String[] args) {
        int number=5;
        String[] name={"Sai", "Varun", "Iniyavan", "Sudhiks", "Edhalya"};
        String temp;
        for(int i=0; i<number; i++){
            for(int j=i+1; j<number; j++){
                if(name[i].compareTo(name[j])>0){
                    temp=name[i];
                    name[i]=name[j];
                    name[j]=temp;
                }
            }
        }
        System.out.println("enter the array names in alphabetic order:");
        for(int i=0; i<number; i++){
            System.out.println(name[i]);
        }
    }
}
