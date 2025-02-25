public class Main {
    public static void main(String[] args) {
        int size = 50;
        int[] oddNumbers = new int[size];

        for (int i = 0, num = 1; i < size; i++, num += 2) {
            oddNumbers[i] = num;
        }

        for (int num : oddNumbers) {
            System.out.println(num);
        }
    }
}
