import java.util.Random;

public class Main2 {
    public static void main(String[] args) {
        Random rand = new Random();
        int[] arr = new int[20];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt(10);
        }

        System.out.println("Початковий масив:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();

        for (int i = 1; i < arr.length; i += 2) {
            arr[i] = 0;
        }

        System.out.println("Оновлений масив:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}

