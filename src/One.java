class One {
    private int number;

    One() {
        this.number = 0;
    }

    One(int number) {
        this.number = number;
    }

    One(String numberStr) {
        this.number = Integer.parseInt(numberStr);
    }

    One(double numberDouble) {
        this.number = (int) numberDouble;
    }

    int getNumber() {
        return number;
    }

    void setNumber(int number) {
        this.number = number;
    }

    void printValue(int value) {
        System.out.println("One (int): " + value);
    }

    void printValue(double value) {
        System.out.println("One (double): " + value);
    }

    void displayInfo() {
        System.out.println("One: число = " + number);
    }
}

