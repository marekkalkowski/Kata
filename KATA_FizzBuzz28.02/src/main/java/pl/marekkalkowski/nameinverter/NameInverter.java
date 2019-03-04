package pl.marekkalkowski.nameinverter;

public class NameInverter {


    public String invert(String name) {
        String result = "";
        if (name == null) {throw new NullPointerException("Null not allow");}

        if (name == "" || name == "    ") {throw new IllegalArgumentException("no names added");}

        result = name;

        return result;
    }
}
