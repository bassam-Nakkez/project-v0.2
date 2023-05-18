package AST;

import AST.Expression.Expression;
import AST.Statements.Call;
import AST.Statements.Declaration;

public class VariableDeclaration extends Declaration {

    public boolean _const = false;
    public boolean _final = false;
    public String Type ;
    public String varName ;
    public Expression expression ;
    public Boolean aBoolean = null ;
    public Call call = null;




    public boolean is_const() {
        return _const;
    }

    public void set_const(boolean _const) {
        this._const = _const;
    }

    public boolean is_final() {
        return _final;
    }

    public void set_final(boolean _final) {
        this._final = _final;
    }

    public String getType() {
        return Type;
    }

    public void setType(String type) {
        Type = type;
    }

    public String getVarName() {
        return varName;
    }

    public void setVarName(String varName) {
        this.varName = varName;
    }

    public Expression getExpression() {
        return expression;
    }

    public void setExpression(Expression expression) {
        this.expression = expression;
    }

    public Boolean getaBoolean() {
        return aBoolean;
    }

    public void setaBoolean(Boolean aBoolean) {
        this.aBoolean = aBoolean;
    }


    @Override
    public String toString() {


        if(!_const && !_final && expression == null && aBoolean== null){ return "VariableDeclaration{"+ Type + " " + varName  + " ; "  ;}
        if(!_const && !_final && expression == null && aBoolean== null){ return "VariableDeclaration{"+ Type + " " + varName  + " ; "  ;}
        if(!_const && !_final && expression != null){ return "VariableDeclaration{"+ Type + " " + varName  + " = " + expression.toString() ;}
        if(!_const && !_final && aBoolean != null){ return "VariableDeclaration{"+ Type + " " + varName  + " = " + aBoolean.toString() ;}
        if(!_const && !_final && expression == null && aBoolean== null){ return "VariableDeclaration{"+ Type + " " + varName  + " ; "  ;}
        if(!_const && _final && expression != null ){ return "VariableDeclaration{ final "+ Type + " " + varName  + " = " + expression.toString() ;}
        if(_const && !_final && expression != null ){ return "VariableDeclaration{ const "+ Type + " " + varName  + " = " + expression.toString() ;}
        if(!_const && _final && aBoolean != null ){ return "VariableDeclaration{ final "+ Type + " " + varName  + " = " + aBoolean.toString() ;}
        return "VariableDeclaration{ const "+ Type + " " + varName  + " = " + aBoolean.toString() ;



    }
}
