public
enum Technology {
    JAVA(800), C(2000), CPP(2500), PYTHON(1730), LINUX(700);

    private int value;

    private Technology(int value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return name() + "(" + value + ")";
    }

    public int getValue() {
        return value;
    }
}