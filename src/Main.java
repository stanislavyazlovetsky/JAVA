public class Main {
    public static void main(String[] args) {
        One obj1a = new One();
        One obj1b = new One(10);
        One obj1c = new One("25");
        One obj1d = new One(50.5);

        Two obj2 = new Two("Hello");
        Three obj3 = new Three(true);

        obj1a.printValue(100);
        obj1a.printValue(12.34);

        obj2.printValue("Java");
        obj2.printValue(42);

        obj3.printValue(true);
        obj3.printValue("Success");

        obj1b.displayInfo();
        obj2.displayInfo();
        obj3.displayInfo();

        obj2.combinedMethod(obj1c, obj3);
    }
}
