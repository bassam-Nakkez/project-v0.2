package AST.Call;

import AST.Array.ArrayBody;
import AST.Parameter;
import AST.Statements.Call;

import java.util.ArrayList;
import java.util.List;

public class CallArray extends Call {




List<ArrayBody> arrayBodies = new ArrayList<>();

    public List<ArrayBody> getArrayBodies() {
        return arrayBodies;
    }

    public void setArrayBodies(List<ArrayBody> arrayBodies) {
        this.arrayBodies = arrayBodies;
    }


    @Override
    public String toString() {
        String str =  "CallArray{";
        for(ArrayBody e : this.arrayBodies )
        {

            str = str + "\n" + e.toString() ;
        }
        return str + "\n " + arrayBodies +'}';
    }
}
