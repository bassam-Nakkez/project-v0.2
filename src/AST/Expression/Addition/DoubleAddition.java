package AST.Expression.Addition;


import AST.Expression.Addition.Addition;
import AST.Expression.Expression;

public class DoubleAddition extends Addition {




        double nodeValue;


        public  DoubleAddition (Expression left , Expression right )
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
            return left.toString() + " + " + right.toString();
        }
}

