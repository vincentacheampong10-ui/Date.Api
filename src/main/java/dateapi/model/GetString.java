package dateapi.model;

public class GetString {

    private String string;

    public GetString(String original) {
        this.string = original;
    }

    public String getString() {
        return string;
    }

    public String getReversed() {
        return new StringBuilder(string).reverse().toString();
    }

    public String getOpposite() {
        String[] words = string.split(" ");
        if (words.length < 2) {
            return string;
        }
        return words[1] + " " + words[0];
    }
}
