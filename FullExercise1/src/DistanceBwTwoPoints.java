public class DistanceBwTwoPoints {
    public static void main(String[] args) {
        int x1,x2,y1,y2;
        double distance;
        x1=1;y1=3;x2=5;y2=7;
        distance=Math.sqrt((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1));
        System.out.println("distance between"+"("+x1+","+y1+"),"+"("+x2+","+y2+")===>"+distance);
    }
}
