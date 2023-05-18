package AST.ClassAndObject.Object;

import AST.Statements.Call;
import AST.Call.CallFunction;

public class ObjectMethod extends Call {
    String objectName ;
    CallFunction callFunction = null;


    public String getObjectName() {
        return objectName;
    }

    public void setObjectName(String objectName) {
        this.objectName = objectName;
    }

    public CallFunction getCallFunction() {
        return callFunction;
    }

    public void setCallFunction(CallFunction callFunction) {
        this.callFunction = callFunction;
    }

    @Override
    public String toString() {
        return "ObjectMethod{" + objectName + '\n' + callFunction.toString() + '}';
    }
}
