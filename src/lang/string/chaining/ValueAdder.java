package lang.string.chaining;

public class ValueAdder {

    private int value;

    public void add(int addValue) {
        value += addValue;
        return;

    }

    public int getValue() {
        return value;
    }
}
