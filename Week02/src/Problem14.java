public class Problem14 {
    public static void main(String[] args) {
        int age = 25;
        if (age < 2) {
            System.out.println("Baby");
        } else if (age >= 2 && age < 10) {
            System.out.println("Child");
        } else if (age < 20) {
            System.out.println("Teen-age");
        } else if (age < 30) {
            System.out.println("Adult");
        } else {
            System.out.println("Old");
        }
    }
}
