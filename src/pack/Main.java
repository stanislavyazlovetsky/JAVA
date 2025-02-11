package pack;

public class Main {
    public static void main(String[] args) {
        // Створення об'єктів класів
        One one = new One(5, 3.14, "Hello");
        Two two = new Two(2.5f, true, 'A');
        Three three = new Three(100L, (short) 50, (byte) 10);

        one.printValues();
        System.out.println("Сума значень у One: " + one.sumValues());

        two.displayInfo();
        System.out.println("Подвоєне значення x у Two: " + two.getDoubleValue());

        three.showNumbers();
        three.acceptTwo(two); // Передача об'єкта класу Two у метод класу Three
    }
}
