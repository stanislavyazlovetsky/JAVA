package pack;

public class Two {
    private float x;
    private boolean y;
    private char z;

    public Two(float x, boolean y, char z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public void displayInfo() {
        System.out.println("Two: x = " + x + ", y = " + y + ", z = " + z);
    }

    public double getDoubleValue() {
        return x * 2.5;
    }
}
