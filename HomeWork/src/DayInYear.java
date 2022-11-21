import java.util.Scanner;

public class DayInYear {
    public static void main(String[] args) {
        Scanner day=new Scanner(System.in);
        int s;
        System.out.println("enter day");
        int S=day.nextInt();
        s=S%7;

        switch(s){
            case 1:
                System.out.println("Monday");
                break;

            case 2:
                System.out.println("Tuesday");
                break;

            case 3:
                System.out.println("Wednesday");
                break;

            case 4:
                System.out.println("Thursday");
                break;

            case 5:
                System.out.println("Friday");
                break;

            case 6:
                System.out.println("Saturday");
                break;

            case 0:
                System.out.println("Sunday");
                break;
        }

    }
}
