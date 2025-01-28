public class Division {
    public static void main(String[] args) {
        int a = 10;
        int b = 3;

        if (b != 0) {

            int quotient = a / b;
            int remainder = a % b;

            System.out.println("Результат ділення: " + quotient);
            System.out.println("Залишок від ділення: " + remainder);
        }
    }
}
