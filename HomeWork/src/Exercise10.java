public class Exercise10 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 3, 4, 4, 3, 5, 7, 6, 3, 4};
        int[] a=new int[array.length];
        int visit=-1;
        for (int i = 0; i < array.length - 1; i++) {
            int count = 1;
            for (int j = i + 1; j < array.length - 1; j++) {
                if (array[i] == array[j]) {
                    count++;
                    a[j] = visit;
                }
            }
            if (a[i] != visit)
                a[i] = count;
        }
                    System.out.println("values / counting the values ");
                    for(int i=0; i<a.length; i++){
                        if(a[i] != visit)
                            System.out.println(" " + array[i] + "/" + a[i]);
                        }
                    }
                }


