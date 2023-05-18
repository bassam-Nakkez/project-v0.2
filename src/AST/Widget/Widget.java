package AST.Widget;

import AST.Statements.Statement;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
public class Widget extends Statement {

    public int number = 0;


    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }


    public String buildCode()
    {
        return "";
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
