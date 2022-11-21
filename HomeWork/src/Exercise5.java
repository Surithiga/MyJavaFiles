public class Exercise5{
    public static void main(String[] args) {
        String names[]={"Surithiga", "Vinitha", "Ahalya", "Dharshini"," Selvi", "Dharani"};
        for(int i=0; i<names.length; i++){
            char lastchar=names[i].charAt(names[i].length()-1);
            if(lastchar=='a'){
                System.out.println("last char: "+names[i]);
            }
        }

    }
}
