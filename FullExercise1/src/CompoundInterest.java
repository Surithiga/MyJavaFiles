public class CompoundInterest {
    public static void main(String[] args) {
        double amount= 0, principle= 10000, rate=10, time=5, ci;
        System.out.println("Principle=" +principle);
        System.out.println("rate=" +rate);
        System.out.println("time=" +time);

        ci=principle*Math.pow((1+rate/100),time);
        System.out.println("Compound interest:"+ci);
    }
}
