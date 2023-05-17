package AST.Expression.Multiplication;

import AST.Expression.Expression;

public class FloatMultiplication extends Multiplication {


    float nodeValue;


    public FloatMultiplication(Expression left , Expression right )
    {
        this.left = left;
        this.right= right;

    }

    public float getNodeValue() {
        return nodeValue;
    }

    public void setNodeValue(float nodeValue) {
        this.nodeValue = nodeValue;
    }

    @Override
    public String toString() {
        return " Multiplication{ "+ left.toString() + " * " + right.toString()+ "}";
    }
}
