package AST.Array;

import java.util.ArrayList;

public class DoubleArray extends TypeArray {
    ArrayList<Double> Double;

    public DoubleArray() {
        this.Double = new ArrayList();

    }

    void addChild(Double element) {
        this.Double.add(element);
    }

    @Override
    public String toString() {



        String str =  "DoubleArray {";
        for(Double e : this.Double )
        {

            str = str + "," + e.toString() ;
        }

        return str + " }";
    }
}
