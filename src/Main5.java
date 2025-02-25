import java.util.Random;

public class Main5 {
    public static void main(String[] args) {
        Random rand = new Random();
        int[] arr = new int[15];
        int evenCount = 0;

        for (int i = 0; i < 15; i++) {
            arr[i] = rand.nextInt(11);
        }

        System.out.print("Масив: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();

        for (int num : arr) {
            if (num % 2 == 0) {
                evenCount++;
            }
        }

        System.out.println("Кількість парних елементів: " + evenCount);
    }
}

