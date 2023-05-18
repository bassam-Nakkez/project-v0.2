package AST.Array;

import java.util.ArrayList;

public class FloatArray extends TypeArray{

    ArrayList<Float> Float;

    public FloatArray() {
        this.Float = new ArrayList();

    }

    void addChild(Float element) {
        this.Float.add(element);
    }

    @Override
    public String toString() {



        String str =  "FloatArray {";
        for(Float e : this.Float )
        {

            str = str + "," + e.toString() ;
        }

        return str + " }";
    }
}
