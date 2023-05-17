package AST.ClassAndObject.Class;

import AST.Statements.Statement;

public class MethodBlock {



    Statement statement = null;
    This aThis = null;

    public Statement getStatement() {
        return statement;
    }

    public void setStatement(Statement statement) {
        this.statement = statement;
    }

    public This getaThis() {
        return aThis;
    }

    public void setaThis(This aThis) {
        this.aThis = aThis;
    }

    @Override
    public String toString() {
        return "MethodBlock{" + statement.toString() + aThis.toString() +"}";
    }
}
