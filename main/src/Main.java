public class Main {
    public static void main(String[] args) {
        //  1
        int n1 = 150;
        if (n1 > 50 && n1 < 100) {
            System.out.println("Число " + n1 + " міститься в проміжку (25; 100)");
        } else {
            System.out.println("Число " + n1 + " не міститься в проміжку (25; 100)");
        }

        //  2
        int n2 = 785;
        int maxDigit = Math.max(n2 % 10, Math.max((n2 / 10) % 10, n2 / 100));
        System.out.println("Найбільша цифра числа " + n2 + " - " + maxDigit);

        //  3
        int currentFloor = 8; // Поточний
        int targetFloor = 2; // Бажаний

        if (targetFloor == 2) {
            if (currentFloor < targetFloor) {
                System.out.println("Ви піднялись на 3 поверх");
            } else {
                System.out.println("Ви спустились на 1 поверх");
            }
        } else if (targetFloor >= 1 && targetFloor <= 9) {
            if (currentFloor < targetFloor) {
                System.out.println("Ви піднялись на " + targetFloor + " поверх");
            } else {
                System.out.println("Ви спустились на " + targetFloor + " поверх");
            }
        } else {
            System.out.println("Некоректний поверх!");
        }

        //  4
        String choice = "Yes";
        switch (choice) {
            case "Так": case "ОК": case "Yes": case "Y": case "+": case "Ok":
                System.out.println("Я погоджуюсь!");
                break;
            case "Ні": case "NO": case "N": case "-": case "No":
                System.out.println("Я відмовляюсь!");
                break;
            default:
                System.out.println("Невідома команда");
        }
    }
}
