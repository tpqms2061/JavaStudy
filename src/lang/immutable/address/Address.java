package lang.immutable.address;

public class Address {

    private String Value;

    public Address(String Value) {
        this.Value = Value;
    }

    public void setValue(String value) {
        Value = value;
    }

    public String getValue() {
        return Value;
    }

    @Override
    public String toString() {
        return "Address{" +
                "Value='" + Value + '\'' +
                '}';
    }
}
