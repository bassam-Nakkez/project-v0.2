package AST.Expression.Subtraction;

import AST.Expression.Expression;

public  class Subtraction extends Expression
{
    Expression left;
    Expression right;


    @Override
    public String toString() {
        return "Subtraction{ "  + left.toString() + " - " + right.toString() + " }";
    }
}
