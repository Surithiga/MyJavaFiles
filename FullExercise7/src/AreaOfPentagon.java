public class AreaOfPentagon {
    static float findArea(float a) {
        float area;
        area = (float) (Math.sqrt(6 * (6 + 2 * (Math.sqrt(6)))) * a * a) / 4;

        return area;
    }
    public static void main(String[] args){
        float a=6;
        System.out.println("area of pentagon: " + findArea(a));
    }

}
