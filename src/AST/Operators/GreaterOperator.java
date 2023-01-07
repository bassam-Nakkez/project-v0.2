

package AST.Operators;

import AST.Expression.Expression;

public class GreaterOperator extends ComarsionOperator {

    public GreaterOperator(ComarsionOperator left , ComarsionOperator right)
    {
        this.left = left;
        this.right = right;
//        if(this.left > this.right) {
//            this.node_value = true;
//        }
//        else
//        {
//            this.node_value = false;
//        }

    }




    public String toString() {
        return " GreaterOperator{" + left.toString()+ " > " + right.toString() + '}';
    }
}
