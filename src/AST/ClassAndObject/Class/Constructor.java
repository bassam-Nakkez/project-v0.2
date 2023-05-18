package AST.ClassAndObject.Class;

import AST.Parameter;

import java.util.ArrayList;
import java.util.List;

public class Constructor {

    String name;
    List<Parameter> parameters = new ArrayList<>();
    MethodBody methodBody = null ;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
        String str =  "Constructor { ";
        for(Parameter e : this.parameters )
        {

            str = str + "\n" + e.toString() ;
        }
        return  str +"\n" + name  + '\''+ methodBody.toString() + "}";
    }
}
