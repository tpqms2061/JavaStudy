package lang.immutable.address;

public class ImmutableAddress{

    private final String Value;

    public ImmutableAddress(String Value) {
        this.Value = Value;
    }

    /*public void setValue(String value) {
        Value = value;
    }
*/ //final 설정함으로써 불변을 만들게 해서 setValue를 못하게 하기위함
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
