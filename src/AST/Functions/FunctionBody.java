package AST.Functions;

import AST.Block;
import AST.Return;

public class FunctionBody {



    Block block = null;
    Return aReturn = null;


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


    @Override
    public String toString() {
        return "FunctionBody{" +"\n" + block.toString() +"\n"+ aReturn.toString() +
              "}";
    }
}
