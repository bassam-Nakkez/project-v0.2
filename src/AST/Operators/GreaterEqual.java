
package AST.Operators;
import AST.Expression.Expression;

public class GreaterEqual extends ComparsionOperator {


    public String toString() {
        return " LessEqual{" + left.toString()+ " >= " + right.toString() + '}';
    }

}

