import java.util.Random;

public class Main4 {
    public static void main(String[] args) {
        Random rand = new Random();
        int[] array1 = new int[10];
        int[] array2 = new int[10];
        int[] sumArray = new int[10];

        for (int i = 0; i < 10; i++) {
            array1[i] = rand.nextInt(11);
            array2[i] = rand.nextInt(11);
        }

        for (int i = 0; i < 10; i++) {
            sumArray[i] = array1[i] + array2[i];
        }

        System.out.print("Масив 1: ");
        for (int num : array1) {
            System.out.print(num + " ");
        }
        System.out.println();

        System.out.print("Масив 2: ");
        for (int num : array2) {
            System.out.print(num + " ");
        }
        System.out.println();

        System.out.print("Масив суми: ");
        for (int num : sumArray) {
            System.out.print(num + " ");
        }
    }
}

