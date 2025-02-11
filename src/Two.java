class Two {
    private String text;

    Two(String text) {
        this.text = text;
    }

    String getText() {
        return text;
    }

    void setText(String text) {
        this.text = text;
    }

    void printValue(String value) {
        System.out.println("Two (String): " + value);
    }

    void printValue(int value) {
        System.out.println("Two (int): " + value);
    }

    void displayInfo() {
        System.out.println("Two: текст = " + text);
    }

    void combinedMethod(One one, Three three) {
        System.out.println("Об'єднання: " + one.getNumber() + " - " + text + " - " + three.getStatus());
    }
}

