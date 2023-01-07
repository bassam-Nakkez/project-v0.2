package AST.Operators;

import AST.Expression.Expression;

public class lessOperator extends ComarsionOperator {


    lessOperator (Expression left , Expression right )
    {
        this.left = left;
        this.right =right;

        if( left < right)
        {
            this.result =true;

        }

    }

    public String toString() {
        return " lessOperator{" + left.toString()+ " < " + right.toString() + '}';
    }
}
