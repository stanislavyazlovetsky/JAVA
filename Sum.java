public class Sum {public static void main(String[] args) {
    int number = 14;

    if (number >= 10 && number <= 99) {
        int tens = number / 10;
        int units = number % 10;

        int sum = tens + units;

        System.out.println("Сума цифр числа " + number + " дорівнює " + sum);
    }
}
}
