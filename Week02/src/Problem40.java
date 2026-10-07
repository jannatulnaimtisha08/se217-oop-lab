public class Problem40{
    public static void main(String[] args) {
        System.out.println("Program Start");
        int addition = getSum(100, 750);
        System.out.println("Result: " + addition);
    }
    static int getSum(int x, int y) {
        int sum = x + y;
        return sum;
    }
}
