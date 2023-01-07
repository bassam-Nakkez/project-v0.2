package AST.Operators;

import AST.Expression.Expression;



public abstract class  ComarsionOperator extends Operator {

    public ComarsionOperator left;
    public ComarsionOperator right;
    public boolean node_value;

    public ComarsionOperator getLeft() {
        return left;
    }

    public void setLeft(ComarsionOperator left) {
        this.left = left;
    }

    public ComarsionOperator getRight() {
        return right;
    }

    public void setRight(ComarsionOperator right) {
        this.right = right;
    }

    public boolean isNode_value() {
        return node_value;
    }

    public void setNode_value(boolean node_value) {
        this.node_value = node_value;
    }
}
