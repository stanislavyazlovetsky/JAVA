class Three {
    private boolean status;

    Three(boolean status) {
        this.status = status;
    }

    boolean getStatus() {
        return status;
    }

    void setStatus(boolean status) {
        this.status = status;
    }

    void printValue(boolean value) {
        System.out.println("Three (boolean): " + value);
    }

    void printValue(String value) {
        System.out.println("Three (String): " + value);
    }

    void displayInfo() {
        System.out.println("Three: статус = " + status);
    }
}

