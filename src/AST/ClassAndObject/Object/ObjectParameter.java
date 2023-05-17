package AST.ClassAndObject.Object;

import AST.Statements.Call;
import AST.DataType.Data;
import AST.Functions.AnonymousFunction;

public class ObjectParameter extends ObjectNode {

    public String objectName;
    public ObjectClass objectClass = null;
    public String ID = null ;
    public Call call = null;
    public AnonymousFunction anonymousFunction = null;
    public Data data = null;

    public String getObjectName() {
        return objectName;
    }

    public void setObjectName(String objectName) {
        this.objectName = objectName;
    }

    public ObjectClass getObjectClass() {
        return objectClass;
    }

    public void setObjectClass(ObjectClass objectClass) {
        this.objectClass = objectClass;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public Call getCall() {
        return call;
    }

    public void setCall(Call call) {
        this.call = call;
    }

    public AnonymousFunction getAnonymousFunction() {
        return anonymousFunction;
    }

    public void setAnonymousFunction(AnonymousFunction anonymousFunction) {
        this.anonymousFunction = anonymousFunction;
    }

    public Data getData() {
        return data;
    }

    public void setData(Data data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "ObjectParameter{"  + objectName + '\n'  + objectClass.toString() +"\n" + ID + "\n"  + call.toString() +"\n" + anonymousFunction.toString() +"\n"+ data.toString() +
                '}';
    }
}
