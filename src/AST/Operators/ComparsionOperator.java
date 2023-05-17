package AST.Operators;

import AST.Expression.Expression;



public  class ComparsionOperator extends Operator {

    public Expression left;
    public Expression right;
    public boolean node_value;


    public Expression getLeft() {
        return left;
    }

    public void setLeft(Expression left) {
        this.left = left;
    }

    public Expression getRight() {
        return right;
    }

    public void setRight(Expression right) {
        this.right = right;
    }

    public boolean isNode_value() {
        return node_value;
    }

    public void setNode_value(boolean node_value) {
        this.node_value = node_value;
    }
}
