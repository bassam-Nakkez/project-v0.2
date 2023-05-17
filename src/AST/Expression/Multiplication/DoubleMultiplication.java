package AST.Expression.Multiplication;


import AST.Expression.Expression;

public class DoubleMultiplication extends Multiplication {




        double nodeValue;


        public DoubleMultiplication(Expression left , Expression right )
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
        return " Multiplication{ "+ left.toString() + " * " + right.toString()+ "}";
    }
}

