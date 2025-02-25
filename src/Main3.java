import java.util.Random;

public class Main3 {
    public static void main(String[] args) {
        Random rand = new Random();
        int[][] arrays = new int[3][5];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {
                arrays[i][j] = rand.nextInt(6);
            }
        }

        for (int i = 0; i < 3; i++) {
            System.out.print("Масив " + (i + 1) + ": ");
            for (int num : arrays[i]) {
                System.out.print(num + " ");
            }
            System.out.println();
        }

        double[] averages = new double[3];
        for (int i = 0; i < 3; i++) {
            int sum = 0;
            for (int num : arrays[i]) {
                sum += num;
            }
            averages[i] = sum / 5.0;
        }

        int maxIndex = 0;
        for (int i = 1; i < 3; i++) {
            if (averages[i] > averages[maxIndex]) {
                maxIndex = i;
            } else if (averages[i] == averages[maxIndex]) {
                System.out.println("Середнє значення в масивах однакове.");
                return;
            }
        }
        System.out.println("Масив " + (maxIndex + 1) + " має найбільше середнє значення.");
    }
}
