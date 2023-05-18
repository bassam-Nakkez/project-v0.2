package AST.Functions;

public class arrowFunction {

    FunctionBody functionBody = null;

    String name;

    public FunctionBody getFunctionBody() {
        return functionBody;
    }

    public void setFunctionBody(FunctionBody functionBody) {
        this.functionBody = functionBody;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    @Override
    public String toString() {
        return "arrowFunction{" + name + functionBody.toString() +  '\'' + '}';
    }
}
