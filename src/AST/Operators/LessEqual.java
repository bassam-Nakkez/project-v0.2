package AST.Operators;

import AST.Expression.Expression;

public class LessEqual extends ComarsionOperator {

    LessEqual(Expression left , Expression right , boolean result)
    {

        this.left = left;
        this.right = right;
        this.result = result;

    }


    @Override
    public String toString() {
        return " LessEqual{" + left.toString()+ " <= " + right.toString() + '}';
    }
}
