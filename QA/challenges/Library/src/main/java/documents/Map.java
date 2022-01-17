package documents;

import enums.Scales;

import java.util.Formatter;

public class Map extends Document {
    // fields
    Scales scale;
    String mapRef;

    public Map(String title, String author) {
        super(title, author);
    }

    public Map(String title, String author, Scales scale) {
        super(title, author);
        this.scale = scale;
    }

    public String print() {
        StringBuilder output = new StringBuilder();
        // formatting string for readability
        Formatter formatter = new Formatter(output);
        formatter.format("Scale:        |%s \n" +
                        "Map ref:        |%s \n",
                scale, mapRef
        );
        return super.toString() + output;
    }
}
