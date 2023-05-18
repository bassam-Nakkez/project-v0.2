package AST.ClassAndObject.Class;

import AST.ClassAndObject.Class.MethodBlock;
import AST.Parameter;
import AST.Return;

import java.util.ArrayList;
import java.util.List;

public class MethodBody {




    public List<MethodBlock>  methodBlocks = new ArrayList<>();
    public Return aReturn = null;

    public List<MethodBlock> getMethodBlocks() {
        return methodBlocks;
    }

    public void setMethodBlocks(List<MethodBlock> methodBlocks) {
        this.methodBlocks = methodBlocks;
    }

    public Return getaReturn() {
        return aReturn;
    }

    public void setaReturn(Return aReturn) {
        this.aReturn = aReturn;
    }

    @Override
    public String toString() {
        String str =  "MethodBody{";
        for(MethodBlock e : this.methodBlocks )
        {

            str = str + "\n" + e.toString() ;
        }
        return   str + aReturn.toString() + "}";
    }
}
