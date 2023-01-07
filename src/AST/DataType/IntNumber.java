package AST.DataType;

import AST.Expression.Expression;

public class IntNumber extends Type {
    int num ;

    public IntNumber(int num){this.num = num; }

    public int getValue(){return this.num; }

    public String toString() {
        return "IntNumber{ "+ num +" }";
    }
}
