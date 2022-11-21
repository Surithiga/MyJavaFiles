import java.util.Scanner;
public class SecondsMinutesHours {
    public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
        System.out.println("input seconds:");
           int Seconds=sc.nextInt();
           int Sec=Seconds%60;
           int hour=Seconds/60;
           int min=hour%60;
           hour=hour/min;
        System.out.println(hour+":"+min+":"+Sec+":");

    }
}
