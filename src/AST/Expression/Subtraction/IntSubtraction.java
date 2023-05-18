package AST.Expression.Subtraction;

import AST.Expression.Expression;

public class IntSubtraction extends Subtraction {




    int nodeValue;


    public IntSubtraction(Expression left , Expression right )
    {
        this.left = left;
        this.right= right;

    }

    public int getNodeValue() {
        return nodeValue;
    }

    public void setNodeValue(int nodeValue) {
        this.nodeValue = nodeValue;
    }

    @Override
    public String toString() {
        return "Subtraction{ "  + left.toString() + " - " + right.toString() + " }";
    }

}