package AST.Expression.Division;

import AST.Expression.Expression;

public class FloatDiv extends Division {





    float node_value;

    public  FloatDiv  (Expression left , Expression right)
    {
        this.left = left;
        this.right= right;

    }

    public float getNode_value() {
        return node_value;
    }

    public void setNode_value(float node_value) {
        this.node_value = node_value;
    }


}
