package AST.ClassAndObject.Class;

import AST.VariableDeclaration;

public class Property {


    public VariableDeclaration variableDeclaration = null;


    public VariableDeclaration getVariableDeclaration() {
        return variableDeclaration;
    }



    public void setVariableDeclaration(VariableDeclaration variableDeclaration) {
        this.variableDeclaration = variableDeclaration;
    }



    @Override
    public String toString() {
        return "\n Property{ " + variableDeclaration.toString() + '}';
    }
}
