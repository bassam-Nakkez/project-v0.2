package AST.Array;

import java.util.ArrayList;

public class BoolArray extends TypeArray {
    ArrayList<Boolean> Boolean;

    public BoolArray() {
        this.Boolean = new ArrayList();

    }

    void addChild(Boolean bool) {
        this.Boolean.add(bool);
    }

    @Override
    public String toString() {
        return "BoolArray {" + Boolean + "}";

    }
}
