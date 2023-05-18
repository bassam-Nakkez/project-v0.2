package AST.ClassAndObject.Class;

import AST.Parameter;

import java.util.ArrayList;
import java.util.List;

public class Method {


    public String returnType;
    public String methodName;
    public List<Parameter> parameters = new ArrayList<>();
    public MethodBody methodBody = null;


    public String getReturnType() {
        return returnType;
    }

    public void setReturnType(String returnType) {
        this.returnType = returnType;
    }

    public String getMethodName() {
        return methodName;
    }

    public void setMethodName(String methodName) {
        this.methodName = methodName;
    }

    public List<Parameter> getParameters() {
        return parameters;
    }

    public void setParameters(List<Parameter> parameters) {
        this.parameters = parameters;
    }

    public MethodBody getMethodBody() {
        return methodBody;
    }

    public void setMethodBody(MethodBody methodBody) {
        this.methodBody = methodBody;
    }


    @Override
    public String toString() {
        String str = "Method{";
        for(Parameter e : this.parameters )
        {

            str = str + "\n" + e.toString() ;
        }
        return str + returnType + '\'' + methodName + '\'' + parameters + methodBody.toString()+
                "}";
    }
}
