package AST.Operators;

import AST.ClassAndObject.Class.This;
import AST.Expression.Expression;

public class Assignment extends Operator {

    This aThis;

    String varName ;
    Expression right;

    String operator;

    public This getaThis() {
        return aThis;
    }

    public void setaThis(This aThis) {
        this.aThis = aThis;
    }

    public String getVarName() {
        return varName;
    }

    public void setVarName(String varName) {
        this.varName = varName;
    }

    public Expression getRight() {
        return right;
    }

    public void setRight(Expression right) {
        this.right = right;
    }


    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    @Override
    public String toString() {
       return " Assignment{" + varName + " "+this.operator +" "+ right.toString() + "}";
    }
}
