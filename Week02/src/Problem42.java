public class Problem42{
    public static void main(String[] args) {
        int sum = 0;
        int a[][] = {
            {10, 20, 30},
            {40, 50, 60}
        };
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                sum = sum + a[i][j];
            }
        }
        double average = (double) sum / 6;
        System.out.println("Average = " + average);
    }
}
