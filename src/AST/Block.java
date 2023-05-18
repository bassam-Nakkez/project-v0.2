package AST;

import AST.Statements.Statement;

import java.util.ArrayList;
import java.util.List;

public class Block {


    List<Statement> statements = new ArrayList<>() ;


    public Block()
    {
        this.statements = statements = new ArrayList<>();
    }

    public void addStatement(Statement stat) {
        this.statements.add(stat);
    }

    public List<Statement> getStatements() {
        return statements;
    }

    public void setStatements(List<Statement> statments) {
        this.statements = statments;
    }


    @Override
    public String toString() {

        String str = "\n Block{";

        for (Statement Stat : this.statements)
        {
            if (Stat != null)
            {
                str = str +"\t"+ Stat.toString();
            }

        }
        return str +"\n}";
    }
}

