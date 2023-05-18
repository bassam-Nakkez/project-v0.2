package AST.Expression.Subtraction;


import AST.Expression.Expression;

public class DoubleSubtraction extends Subtraction {




        double nodeValue;


        public DoubleSubtraction(Expression left , Expression right )
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
        return "Subtraction{ "  + left.toString() + " - " + right.toString() + " }";
    }
}

