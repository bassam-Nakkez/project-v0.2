package AST.Statements;

import AST.Block;
import AST.Return;

public class StatementBloc {



    public Block block = null;
    public Return aReturn;
    public boolean Break = false;
    public Statement statement = null;

    public Block getBlock() {
        return block;
    }

    public void setBlock(Block block) {
        this.block = block;
    }

    public Return getaReturn() {
        return aReturn;
    }

    public void setaReturn(Return aReturn) {
        this.aReturn = aReturn;
    }

    public boolean isBreak() {
        return Break;
    }

    public void setBreak(boolean aBreak) {
        Break = aBreak;
    }

    public Statement getStatement() {
        return statement;
    }

    public void setStatement(Statement statement) {
        this.statement = statement;
    }






}
