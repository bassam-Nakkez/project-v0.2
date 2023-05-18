package AST.ClassAndObject.Object;


import AST.Statements.Call;

import java.util.ArrayList;
import java.util.List;

public class ObjectProperty  extends Call {


    String objectName;
    List<String> propertyNames = new ArrayList<>();

    public String getObjectName() {
        return objectName;
    }

    public void setObjectName(String objectName) {
        this.objectName = objectName;
    }

    public List<String> getPropertyNames() {
        return propertyNames;
    }

    public void setPropertyNames(List<String> propertyNames) {
        this.propertyNames = propertyNames;
    }

    @Override
    public String toString() {
        String str =  "ObjectParameters{";
        for(String e : this.propertyNames )
        {

            str = str + "\n" + e.toString() ;
        }
        return str + "\n "+objectName+ '}';
    }
}
