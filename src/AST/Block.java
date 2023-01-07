package AST;

import java.util.ArrayList;
import java.util.List;

public class Block {


    List<Statment> statments;


    public Block(List<Statment> statments) {
        this.statments = statments;
    }

    public List<Statment> getStatments() {
        return statments;
    }

    public void setStatments(List<Statment> statments) {
        this.statments = statments;
    }

    public void addStatment(Statment stat) {
        this.statments.add(stat);
    }


}

