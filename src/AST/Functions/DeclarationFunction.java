package AST.Functions;

import AST.Parameter;
import AST.Statements.Declaration;

import java.util.List;

public class DeclarationFunction extends Declaration {
    String type ;
    String name ;
    List<ParameterFunction> parameterFunctions = null;
    FunctionBody functionBody = null;
    arrowFunction arrowFunction = null;





    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<ParameterFunction> getParameterFunctions() {
        return parameterFunctions;
    }

    public void setParameterFunctions(List<ParameterFunction> parameterFunctions) {
        this.parameterFunctions = parameterFunctions;
    }

    public FunctionBody getFunctionBody() {
        return functionBody;
    }

    public void setFunctionBody(FunctionBody functionBody) {
        this.functionBody = functionBody;
    }

    public AST.Functions.arrowFunction getArrowFunction() {
        return arrowFunction;
    }

    public void setArrowFunction(AST.Functions.arrowFunction arrowFunction) {
        this.arrowFunction = arrowFunction;
    }

    @Override
    public String toString() {
        String str =  "DeclarationFunction { ";
        for(ParameterFunction e : this.parameterFunctions )
        {

            str = str + "\n" + e.toString() ;
        }
        return   type + "\n"  + name + "\n"  + str +"\n"+ functionBody.toString() + "\n"+ arrowFunction.toString() +
                '}';
    }
}
