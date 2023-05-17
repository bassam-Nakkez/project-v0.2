package AST.DataType;

import AST.Expression.Expression;

public class IntNumber extends _Number {
    int num ;

    public IntNumber(int num){this.num = num; }

    public int getValue(){return this.num; }

    public String toString() {
        return "IntNumber{ "+ num +" }";
    }
}
