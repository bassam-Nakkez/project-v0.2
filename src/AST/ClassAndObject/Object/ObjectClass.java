package AST.ClassAndObject.Object;

import AST.Statements.Call;
import AST.DataType.StringType;

public class ObjectClass extends Call {

    public  String id;
    public StringType stringType;
    public ObjectParameters objectParameters = null ;

    public String name;




    public StringType getStringType() {
        return stringType;
    }

    public void setStringType(StringType stringType) {
        this.stringType = stringType;
    }

    public ObjectParameters getObjectParameters() {
        return objectParameters;
    }

    public void setObjectParameters(ObjectParameters objectParameters) {
        this.objectParameters = objectParameters;
    }

    public String getId() {return id;}

    public void setId(String id) {this.id = id;}

    @Override
    public String toString() {
        return "ObjectClass{"  + id + '\n'  + stringType.toString() + '\n' + objectParameters.toString() + '}';
    }
}
