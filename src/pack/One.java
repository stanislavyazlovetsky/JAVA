package pack;

public class One {
    private int a;
    private double b;
    private String c;

    public One(int a, double b, String c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public void printValues() {
        System.out.println("One: a = " + a + ", b = " + b + ", c = " + c);
    }

    public int sumValues() {
        return a + (int) b;
    }
}
