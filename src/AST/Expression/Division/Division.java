package AST.Expression.Division;

import AST.Expression.Expression;

public abstract class Division extends Expression
{
    Expression left;
    Expression right;



    @Override
    public String toString() {
        return left.toString() + " / " + right.toString();
    }

}
