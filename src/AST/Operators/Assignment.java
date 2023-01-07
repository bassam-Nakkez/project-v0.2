package AST.Operators;

import AST.Expression.Expression;

public class Assignment extends Operator {

    String left ;
    Expression right;

    Assignment ( String left , Expression right )
    {
        this.left = left;
        this.right = right;
    }


    @Override
    public String toString() {
       return " Assignment{" + left+ " = " + right.toString() + '}';
    }
}
