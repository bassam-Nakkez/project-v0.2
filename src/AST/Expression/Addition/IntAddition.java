package AST.Expression.Addition;

import AST.Expression.Addition.Addition;
import AST.Expression.Expression;

public class IntAddition extends Addition {



    Expression left;
    Expression right;
    int nodeValue;


    public  IntAddition (Expression left , Expression right )
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
        return left.toString() + " + " + right.toString();
    }
}