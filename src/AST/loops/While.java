package AST.loops;

import AST.Statements._Condition;
import AST.Statements.StatementBloc;

public class While extends Loops {

    _Condition condition = null ;
    StatementBloc stat_block = null ;


    public _Condition getCondition() {
        return condition;
    }

    public void setCondition(_Condition condition) {
        this.condition = condition;
    }

    public StatementBloc getStat_block() {
        return stat_block;
    }

    public void setStat_block(StatementBloc stat_block) {
        this.stat_block = stat_block;
    }
}
