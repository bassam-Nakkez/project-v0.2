package AST.Statements.IF_Statement;

import AST.Statements._Condition;
import AST.Statements.StatementBloc;

import java.util.List;

public class _IF extends IF_Statement {


    _Condition condition = null;
    StatementBloc statementBloc = null;

    List < Else_IF > else_if;
    Else anElse = null;




    public _IF() {
        this.condition = null;
        this.statementBloc = null;
        this.else_if = null;
        this.anElse = null;
    }


    public _Condition getCondition() {
        return condition;
    }

    public void Add_Else_IF(Else_IF else_if ){this.else_if.add(else_if) ;}

    public void setCondition(_Condition condition) {
        this.condition = condition;
    }

    public StatementBloc getStatementBloc() {
        return statementBloc;
    }

    public void setStatementBloc(StatementBloc statementBloc) {
        this.statementBloc = statementBloc;
    }

    public List<Else_IF> getElse_if() {
        return else_if;
    }

    public void setElse_if(List<Else_IF> else_if) {
        this.else_if = else_if;
    }

    public Else getAnElse() {
        return anElse;
    }

    public void setAnElse(Else anElse) {
        this.anElse = anElse;
    }




    @Override
    public String toString() {

        if(this.condition != null && this.statementBloc != null && else_if == null && anElse == null ) // only If
        {

            return " IF{" +
                    "\n  ( " + condition.toString() +" )"+
                    "\n\t {" + statementBloc.toString() +"}"+ "}";

        }

        else if(this.condition != null && else_if == null && anElse != null ) // only If and else
        {

            return " IF{" +
                    "\n  ( " + condition.toString() +" )"+
                    "\n\t {" + statementBloc.toString() +"}"+
                    "\n\t  " + anElse.toString() +
                    '}';

        }


        else if(this.condition != null && else_if != null && anElse != null ) // only If and one or more else_if and one else
        {
            String str = " IF{" +
                    "\n  " + condition.toString() +
                    "\n  " + statementBloc.toString() ;


            for (Else_IF e : this.else_if) // for every child in the list of else_if get String
            {
                 str = str +"\n"+ e.toString(); // add string to other
            }
              return str +"\n  " + anElse.toString() + '}'; // return whole String

        }


        else if (this.condition != null && else_if != null && anElse == null) // only If and one or more else_if
        {
            String str = " IF{" +
                    "\n  " + condition.toString() +
                    "\n  " + statementBloc.toString() ;


            for (Else_IF e : this.else_if) // for every child in the list of else_if get String
            {
                str = str + e.toString();
            }
            return str;

        }

        return " IF{" +" ( " + condition.toString() +" ) }"; // only if with condition and withOut block

    }
}
