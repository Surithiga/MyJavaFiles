public class CGPAPercentage {
    public static void main(String[] args) {
        int num=5;
        double m[]=new double[num];
        double g[]=new double[num];
        double cgpa,sum=0;
        m[0]=35;
        m[1]=47;
        m[2]=59;
        m[3]=66;
        m[4]=98;
        for(int i=0; i<num; i++) {
            g[i] = (m[i] / 10);
        }
        for(int i=0; i<num; i++){
            sum += g[i];
        }
        cgpa=sum/num;
        System.out.println("cgpa =" +cgpa);

        System.out.println("percentage from cgpa=" +cgpa *7.5);
    }
}
