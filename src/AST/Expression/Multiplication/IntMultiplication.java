package AST.Expression.Multiplication;

import AST.Expression.Expression;

public class IntMultiplication extends Multiplication {




    int nodeValue;


    public IntMultiplication(Expression left , Expression right )
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
        return " Multiplication{ "+ left.toString() + " * " + right.toString()+ "}";
    }
}