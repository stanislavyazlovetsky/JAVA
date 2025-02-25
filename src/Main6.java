import java.util.Random;

public class Main6 {
    public static void main(String[] args) {
        Random rand = new Random();
        int[][] arr = new int[15][];

        for (int i = 0; i < 15; i++) {
            if (i < 4) {
                arr[i] = new int[5];
            } else if (i < 8) {
                arr[i] = new int[8];
            } else if (i < 12) {
                arr[i] = new int[3];
            } else {
                arr[i] = new int[9];
            }

            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = rand.nextInt(16);
            }
        }

        for (int i = 0; i < 15; i++) {
            for (int num : arr[i]) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}

