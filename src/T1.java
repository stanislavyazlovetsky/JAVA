public class T1 {
        public static void main(String[] args) {
            System.out.println("for:");
            for (int i = 500; i <= 650; i += 10) {
                System.out.print(i + " ");
            }
            System.out.println("\nwhile:");
            int j = 500;
            while (j <= 650) {
                System.out.print(j + " ");
                j += 10;
            }
            System.out.println("\ndo-while:");
            int k = 500;
            do {
                System.out.print(k + " ");
                k += 10;
            } while (k <= 650);
        }
}
