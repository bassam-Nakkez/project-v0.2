package AST.DataType;

import java.util.ArrayList;
import java.util.List;

public class Value {

    int anInt ;
    float aFloat ;
    double aDouble ;
    boolean aBoolean;
    Object objectValue = null;

    List<String> check = new ArrayList<>();




//    public  getValue()
//    {
//        if(check.contains("int")){return this.getAnInt();}
//
//
//        return 0;
//    }

    public int getAnInt() {
        return anInt;
    }

    public void setAnInt(int anInt) {
        this.anInt = anInt;
    }

    public float getaFloat() {
        return aFloat;
    }

    public void setaFloat(float aFloat) {
        this.aFloat = aFloat;
    }

    public double getaDouble() {
        return aDouble;
    }

    public void setaDouble(double aDouble) {
        this.aDouble = aDouble;
    }

    public boolean isaBoolean() {
        return aBoolean;
    }

    public void setaBoolean(boolean aBoolean) {
        this.aBoolean = aBoolean;
    }

    public Object getObjectValue() {
        return objectValue;
    }

    public void setObjectValue(Object objectValue) {
        this.objectValue = objectValue;
    }
}
