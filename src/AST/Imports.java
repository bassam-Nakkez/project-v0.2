package AST;

import AST.Statements.Statement;

import java.util.ArrayList;
import java.util.List;

public class Imports extends Statement {



    List <String> imports = new ArrayList<>();


    public List<String> getImports() {
        return imports;
    }

    public void setImports(List<String> imports) {
        this.imports = imports;
    }



    @Override
    public String toString() {

        String str = "\n Imports{\n";
        for (String im : this.imports)
        {
            str = str +"\t\n"+im.toString();

        }
        return str + " \n }";


    }
}
