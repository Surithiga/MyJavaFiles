import java.util.Scanner;

public class NumOfDaysMonth {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

         int numOfDaysMonth=0;
         String monthName="unknown";

        System.out.println("input a month number:");
        int month=sc.nextInt();

        System.out.println("input a year");
        int year=sc.nextInt();

        switch(month){
            case 1:
                monthName="January";
                numOfDaysMonth=31;
                break;

            case 2:
                monthName="February";
                numOfDaysMonth=29;
                break;

            case 3:
                monthName="March";
                numOfDaysMonth=30;
                break;

            case 4:
                monthName="April";
                numOfDaysMonth=30;
                break;

            case 5:
                monthName="May";
                numOfDaysMonth=31;
                break;
        }

        System.out.println(monthName+" "+year+"has"+numOfDaysMonth+"days");
    }
}
