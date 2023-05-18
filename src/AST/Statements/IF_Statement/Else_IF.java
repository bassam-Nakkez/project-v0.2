package AST.Statements.IF_Statement;

import AST.Statements._Condition;
import AST.Statements.StatementBloc;

public class Else_IF extends  IF_Statement {

    _Condition condition;
    StatementBloc statementBloc;



    public Else_IF(_Condition condition, StatementBloc statementBloc) {
        this.condition = condition;
        this.statementBloc = statementBloc;
    }

    public _Condition getCondition() {
        return condition;
    }

    public void setCondition(_Condition condition) {
        this.condition = condition;
    }

    public StatementBloc getStatementBloc() {
        return statementBloc;
    }

    public void setStatementBloc(StatementBloc statementBloc) {
        this.statementBloc = statementBloc;
    }

    public String toString() {
        return "\n Else IF : { (" + this.condition.toString()  + ") \n " + this.statementBloc.toString() + " }";
    }



}
