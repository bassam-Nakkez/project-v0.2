

package AST.DataType;

import AST.Expression.Expression;

public class DoubleNumber extends Type {
    double num ;

    DoubleNumber (double num){this.num = num; }

    public double getValue() {
        return num;
    }

    public void setNum(double num) {
        this.num = num;
    }

    @Override
    public String toString() {
        return "DoubleNumber{ "+ num +" }";
    }
}
