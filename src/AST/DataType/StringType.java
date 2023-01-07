package AST.DataType;

public class StringType extends Type {
    String string ;

    StringType(String str){this.string = str; }

    public String getValue() {
        return string;
    }

    public void setString(String string) {
        this.string = string;
    }

    public String toString() {
        return "StringType{ "+ string +" }";
    }
}
