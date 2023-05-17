package AST.Functions;

public class AnonymousFunction {


    FunctionBody functionBody = null;

    public FunctionBody getFunctionBody() {
        return functionBody;
    }

    public void setFunctionBody(FunctionBody functionBody) {
        this.functionBody = functionBody;
    }

    @Override
    public String toString() {
        return "AnonymousFunction{" +"\n" + functionBody.toString() +
               "}";
    }
}
