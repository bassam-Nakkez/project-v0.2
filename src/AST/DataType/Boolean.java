package AST.DataType;

public class Boolean extends Data {


    String value = null ;

    @Override
    public String getValue() {
        return value;
    }

    @Override
    public void setValue(String value) {
        this.value = value;
    }

    //    boolean bool  ;
//
//    Boolean(boolean bool){this.bool = bool; }
//
//
//    public boolean getValue() {
//        return bool;
//    }
//
//    public void setBool(boolean bool) {
//        this.bool = bool;
//    }
//
//    @Override
//    public String toString() {
//        return "Boolean{ "+ bool  +" }";
//    }
}




