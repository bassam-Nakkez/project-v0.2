package AST.Functions;

import AST.ClassAndObject.Class.This;

public class ParameterFunction {


    public This aThis = null;
    public ParameterVariableWithDec parameterVariableWithDec = null;


    public This getaThis() {
        return aThis;
    }

    public void setaThis(This aThis) {
        this.aThis = aThis;
    }

    public ParameterVariableWithDec getParameterVariableWithDec() {
        return parameterVariableWithDec;
    }

    public void setParameterVariableWithDec(ParameterVariableWithDec parameterVariableWithDec) {
        this.parameterVariableWithDec = parameterVariableWithDec;
    }

    @Override
    public String toString() {
        return "ParameterFunction{" +"\n"+ aThis.toString() + "\n" + parameterVariableWithDec.toString() +
                '}';
    }
}
