public class T4 {
    public static void main(String[] args) {
        int factorial = 1;

        for (int i = 1; i <= 10; i++) {
            factorial *= i;
        }
        System.out.println("Факторіал 10 (for): " + factorial);

        factorial = 1;
        int i = 1;
        while (i <= 10) {
            factorial *= i;
            i++;
        }
        System.out.println("Факторіал 10 (while): " + factorial);
    }
}


