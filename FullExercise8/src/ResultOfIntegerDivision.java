public class ResultOfIntegerDivision {
    public static void main(String[] args) {
        int totalTheoryMarks=499;
        int totalPracticalMarks=99;
        int totalMarks=600;

        int percentage=((totalTheoryMarks + totalPracticalMarks)*100 )/totalMarks;
        System.out.println("percentage: " + percentage + "%");
    }
}
