public class ReverseString {
    public static void main(String[] args) {
        String Name = "Black horse went to jogging";
        String reversed=" " ;

        String[] rightlist = Name.split(" ");

            for(int i=rightlist.length-1; i>=0; i--){
         reversed=reversed+rightlist[i]+" ";

        }
        System.out.println(reversed);
    }
}

