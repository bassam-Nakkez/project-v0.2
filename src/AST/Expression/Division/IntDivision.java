package AST.Expression.Division;

import AST.Expression.Addition.Addition;
import AST.Expression.Expression;

public class IntDivision extends Division {

    int nodeValue;


    public IntDivision(Expression left , Expression right )
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
        return "Division{" + left.toString() + " / " + right.toString() + "}";
    }
}