package AST.DataType;

public class Boolean extends Type {
    boolean bool  ;

    Boolean(boolean bool){this.bool = bool; }


    public boolean getValue() {
        return bool;
    }

    public void setBool(boolean bool) {
        this.bool = bool;
    }

    @Override
    public String toString() {
        return "Boolean{ "+ bool +" }";
    }
}




