public class Main {
    public static void main(String[] args) {
        Animal dog = new Dog("Rex");
        Animal cat = new Cat("Kitty");
        dog.makeSound();
        cat.makeSound();

        Vehicle car = new Car("Jaguar");
        car.displayInfo();

        Person p1 = new Person("Oleg", 30);
        Person p2 = new Person("Oleg", 30);
        System.out.println(p1);
        System.out.println("Are p1 and p2 equal? " + p1.equals(p2));

        Shape circle = new Circle(5);
        Shape rectangle = new Rectangle(4, 6);
        System.out.println("Circle area: " + circle.calculateArea());
        System.out.println("Rectangle area: " + rectangle.calculateArea());

        Movable bike = new Bike();
        bike.move();
    }
}
