package AST.Array;

import java.util.ArrayList;


public class StringArray extends TypeArray {
    ArrayList<String> String;

    public StringArray() {
        this.String = new ArrayList();

    }

    void addChild(String text) {
        this.String.add(text);
    }

    public String toString() {

        String str =  "StringArray { ";
        for(String e : this.String )
        {

            str = str + "," + e.toString() ;
        }

        return str + " }";
    }
}
