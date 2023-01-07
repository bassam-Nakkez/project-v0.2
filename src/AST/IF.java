package AST;

import java.util.List;

public class IF extends IF_Statment {


    Condition condition;
    StatmentBloc statmentBloc;

    List < Else_IF > else_if;
    Else anElse;

    public IF() {
        this.condition = null;
        this.statmentBloc = null;
        this.else_if = null;
        this.anElse = null;
    }

    public IF(Condition condition, StatmentBloc statmentBloc, Else_IF else_if, Else anElse) {
        this.condition = condition;
        this.statmentBloc = statmentBloc;
        this.else_if = else_if;
        this.anElse = anElse;
    }

    public Condition getCondition() {
        return condition;
    }

    public void setCondition(Condition condition) {
        this.condition = condition;
    }

    public StatmentBloc getStatmentBloc() {
        return statmentBloc;
    }

    public void setStatmentBloc(StatmentBloc statmentBloc) {
        this.statmentBloc = statmentBloc;
    }

    public Else_IF getElse_if() {
        return else_if;
    }

    public void setElse_if(Else_IF else_if) {
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
        if(statmentBloc != null && else_if != null && anElse != null )
        {
            return " IF{" +
                    "\n  " + condition.toString() +
                    "\n  " + statmentBloc.toString() +
                    "\n  " + else_if.toString()+
                    "\n  " + anElse.toString() +
                    '}';

        }

    }
}
