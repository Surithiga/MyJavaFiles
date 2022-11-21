public class BattingAverage {
    public static void main(String[] args) {
        int TotalMatches= 50, TotalRuns= 2000, Innings= 40, NotOut=1;
        double avg;
        avg=TotalRuns/(Innings-NotOut);
        System.out.println("Batting Average="+avg);
    }
}
