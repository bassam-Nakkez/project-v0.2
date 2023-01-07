
package AST.Operators;
import AST.Expression.Expression;

public class GreaterEqual extends ComarsionOperator {

    GreaterEqual(ComarsionOperator left , ComarsionOperator right , boolean result)
    {

        this.left = left;
        this.right =right;
        this.result =result;

    }

    public String toString() {
        return " LessEqual{" + left.toString()+ " >= " + right.toString() + '}';
    }

}

