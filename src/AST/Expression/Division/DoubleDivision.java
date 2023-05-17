package AST.Expression.Division;


import AST.Expression.Addition.Addition;
import AST.Expression.Expression;

public class DoubleDivision extends Division{




        double nodeValue;


        public DoubleDivision(Expression left , Expression right )
        {
            this.left = left;
            this.right= right;

        }

    public double getNodeValue() {
        return nodeValue;
    }

    public void setNodeValue(double nodeValue) {
        this.nodeValue = nodeValue;
    }

    @Override
    public String toString() {
        return "Division{" + left.toString() + " / " + right.toString() + "}";
    }
}

