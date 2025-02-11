package pack;

public class Three {
    private long p;
    private short q;
    private byte r;

    public Three(long p, short q, byte r) {
        this.p = p;
        this.q = q;
        this.r = r;
    }

    public void showNumbers() {
        System.out.println("Three: p = " + p + ", q = " + q + ", r = " + r);
    }

    public void acceptTwo(Two obj) {
        System.out.println("Виклик методу displayInfo() у класу Two");
        obj.displayInfo();
    }
}
