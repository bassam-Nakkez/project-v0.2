package AST.ClassAndObject.Object;

import AST.Parameter;
import AST.Statements.Call;
import AST.DataType.Data;
import AST.Functions.AnonymousFunction;

public class ObjectParameter extends ObjectNode {

    public String objectName;
    public ObjectClass objectClass = null;
    public String parameterName = null ;
    public Call call = null;
    public AnonymousFunction anonymousFunction = null;
    public Data data = null;

    public void copy(ObjectParameter obj)
    {
        if (this.objectName != null){
            obj.setObjectName(this.objectName);

        }
        if (this.parameterName != null) {
            obj.setParameterName(this.parameterName);

        }

        if (this.call != null)       {
            obj.setCall(this.call);

        }


        if (this.data != null)
        {
            obj.setData(this.data);

        }


    }

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

    public String getParameterName() {
        return parameterName;
    }

    public void setParameterName(String parameterName) {
        this.parameterName = parameterName;
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
        return "ObjectParameter{"  + objectName + '\n'  + objectClass.toString() +"\n" + parameterName + "\n"  + call.toString() +"\n" + anonymousFunction.toString() +"\n"+ data.toString() +
                '}';
    }
}
