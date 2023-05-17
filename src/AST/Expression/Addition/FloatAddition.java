package AST.Expression.Addition;

import AST.Expression.Addition.Addition;
import AST.Expression.Expression;

public class FloatAddition extends Addition {



    float nodeValue;


    public  FloatAddition (Expression left , Expression right )
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
        return left.toString() + " + " + right.toString();
    }
}
