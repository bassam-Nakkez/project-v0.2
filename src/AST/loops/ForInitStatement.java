package AST.loops;

import AST.Operators.Assignment;
import AST.VariableDeclaration;

public class ForInitStatement extends Loops {



VariableDeclaration variableDeclaration = null ;
Assignment assignment = null;


    public VariableDeclaration getVariableDeclaration() {
        return variableDeclaration;
    }

    public void setVariableDeclaration(VariableDeclaration variableDeclaration) {
        this.variableDeclaration = variableDeclaration;
    }

    public Assignment getAssignment() {
        return assignment;
    }

    public void setAssignment(Assignment assignment) {
        this.assignment = assignment;
    }





}
