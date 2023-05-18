package AST.Array;

import java.util.ArrayList;

public class IntArray extends TypeArray {
    ArrayList<Integer> integers;

    public IntArray() {
        this.integers = new ArrayList();

    }

    void addChild(int element) {
        this.integers.add(element);
    }

    public String toString() {



        String str =  "IntArray {";
        for(Integer e : this.integers )
        {

            str = str + "," + e.toString() ;
        }

        return str + " }";
    }
}
