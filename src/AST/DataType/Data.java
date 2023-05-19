package AST.DataType;

import AST.Expression.Expression;

public  class Data extends Expression {

    String value = "";

    public void copy(Data data)
    {
        data.setValue(this.value);
    }
    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
