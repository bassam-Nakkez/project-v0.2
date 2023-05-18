package AST.Expression.Subtraction;

import AST.Expression.Expression;

public class FloatSubtraction extends Subtraction {



    float nodeValue;


    public FloatSubtraction(Expression left , Expression right )
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
        return "Subtraction{ "  + left.toString() + " - " + right.toString() + " }";
    }
}
