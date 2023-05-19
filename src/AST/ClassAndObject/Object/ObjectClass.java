package AST.ClassAndObject.Object;

import AST.Statements.Call;
import AST.DataType.StringType;

public class ObjectClass extends Call {

    public  String ObjectName;
    public StringType stringType;
    public ObjectParameters objectParameters = null ;

    public String name;

    public void copy(ObjectClass obj)
    {
        if ( this.ObjectName != null)
        {
            obj.setObjectName(this.ObjectName);

        }
        if (this.objectParameters != null)
        {
            obj.getObjectParameters().copy(this.objectParameters);
        }

        if(this.stringType != null){
            obj.setStringType(this.stringType);
        }

        if(this.name != null)
        {
            obj.setName(this.name);

        }

    }

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

    public String getObjectName() {
        return ObjectName;
    }

    public void setObjectName(String objectName) {
        ObjectName = objectName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "ObjectClass{"   + '\n'  + stringType.toString() + '\n' + objectParameters.toString() + '}';
    }
}
