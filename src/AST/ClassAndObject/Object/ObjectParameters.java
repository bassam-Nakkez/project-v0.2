package AST.ClassAndObject.Object;

import AST.ClassAndObject.Class.MethodBlock;

import java.util.ArrayList;
import java.util.List;

public class ObjectParameters extends ObjectNode {


    List<ObjectParameter> objectParameters = new ArrayList<>();

    public List<ObjectParameter> getObjectParameters() {
        return objectParameters;
    }

    public void setObjectParameters(List<ObjectParameter> objectParameters) {
        this.objectParameters = objectParameters;
    }

    @Override
    public String toString() {
        String str =  "ObjectParameters{";
        for(ObjectParameter e : this.objectParameters )
        {

            str = str + "\n" + e.toString() ;
        }

        return  str +'}';
    }
}
