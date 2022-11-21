import java.util.Scanner;

public class StudentsGrade {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        float quiz_score, half_score, annual_score, avg;

        System.out.println("enter your quiz score");
        quiz_score=sc.nextFloat();

        System.out.println("enter your half score");
        half_score=sc.nextFloat();

        System.out.println("enter your annual score");
        annual_score=sc.nextFloat();

        avg= quiz_score + half_score + annual_score;
        if(avg>=90){
            System.out.println("your grade A");
        }
        else if((avg>=70) && (avg<90)){
            System.out.println("your grade B");
        }
        else if ((avg>=50) && (avg<70)){
            System.out.println("your grade C");
        } else if (avg<50) {
            System.out.println("your grade D");
        }
        else {
            System.out.println("invalid");
        }
    }
}
