package AST.DataType;

import AST.Expression.Expression;

public class FloatNumber extends _Number {
    float num ;

    FloatNumber(float num){this.num = num; }

    public float getValue() {
        return num;
    }

    public void setNum(float num) {
        this.num = num;
    }

    @Override
    public String toString() {
        return "FloatNumber{ "+ num +" }";
    }
}
