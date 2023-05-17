package AST.Expression.Division;

import AST.Expression.Addition.Addition;
import AST.Expression.Expression;

public class FloatDivision extends Division {




    float nodeValue;


    public FloatDivision(Expression left , Expression right )
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
        return "Division{" + left.toString() + " / " + right.toString() + "}";
    }
}
