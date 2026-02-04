package dateapi.model;

public class GetString {
    private String string;

    public GetString(String string) {
        this.string = string;
    }

    public String getString() {
        return new StringBuilder(string).reverse().toString();
    }
}
