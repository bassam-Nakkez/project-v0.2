package AST.Expression;

public class Unit extends Expression
{
    Expression expression ;





    public Expression getExpression() {
        return expression;
    }

    public void setExpression(Expression expression) {
        this.expression = expression;
    }

    @Override
    public String toString() {
        return " ( " + expression.toString() + ")";
    }
}
