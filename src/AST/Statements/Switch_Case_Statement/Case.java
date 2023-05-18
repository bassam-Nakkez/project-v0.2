package AST.Statements.Switch_Case_Statement;

import AST.Block;
import AST.DataType.Data;
import AST.Return;

public class Case extends  SwitchStatement {

    Data type = null;
    Block block = null;
    boolean Break= false;
    Return aReturn = null;

    public Data getType() {
        return type;
    }

    public void setType(Data type) {
        this.type = type;
    }

    public Block getBlock() {
        return block;
    }

    public void setBlock(Block block) {
        this.block = block;
    }

    public boolean isBreak() {
        return Break;
    }

    public void setBreak(boolean aBreak) {
        Break = aBreak;
    }

    public Return getaReturn() {
        return aReturn;
    }

    public void setaReturn(Return aReturn) {
        this.aReturn = aReturn;
    }


}
