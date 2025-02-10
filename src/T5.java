public class T5 {
        public static void main(String[] args) {
            int count = 0;

            for (int hours = 0; hours < 24; hours++) {
                for (int minutes = 0; minutes < 60; minutes++) {
                    int h1 = hours / 10;
                    int h2 = hours % 10;
                    int m1 = minutes / 10;
                    int m2 = minutes % 10;
                    if (h1 == m2 && h2 == m1) {
                        count++;
                        System.out.printf("%02d:%02d\n", hours, minutes);
                    }
                }
            }

            System.out.println("Кількість симетричних комбінацій: " + count);
        }


}
