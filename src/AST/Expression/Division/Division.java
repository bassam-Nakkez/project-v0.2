package AST.Expression.Division;

import AST.Expression.Expression;

public  class   Division extends Expression
{
    Expression left;
    Expression right;

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

    @Override
    public String toString() {
        return "Division{" + left.toString() + " / " + right.toString() + "}";
    }
}
