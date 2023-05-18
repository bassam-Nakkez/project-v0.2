package AST.Statements.IF_Statement;

import AST.Statements.StatementBloc;

public class Else extends IF_Statement {

    StatementBloc statementBloc = null;

    public Else(StatementBloc statementBloc) {
        this.statementBloc = statementBloc;
    }

    public StatementBloc getStatementBloc() {
        return statementBloc;
    }

    public void setStatementBloc(StatementBloc statementBloc) {
        this.statementBloc = statementBloc;
    }

    public String toString() {
        return "\n the ELSE statement Block : { " + this.statementBloc.toString() + " }";
    }

}
