package AST.Functions;

import AST.Expression.Expression;

public class ParameterVariableWithDec {

    String type;
    String variableName;
    Expression expression = null;


    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getVariableName() {
        return variableName;
    }

    public void setVariableName(String variableName) {
        this.variableName = variableName;
    }

    public Expression getExpression() {
        return expression;
    }

    public void setExpression(Expression expression) {
        this.expression = expression;
    }


    @Override
    public String toString() {
        return "ParameterVariableWithDec{"  + type + "\n" + variableName + "\n"+ expression.toString() +
                "}";
    }
}
