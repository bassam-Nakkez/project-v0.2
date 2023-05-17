package AST.ClassAndObject.Class;

import java.util.ArrayList;
import java.util.List;

public class Interfaces  {

    TypeNotVoid typeNotVoids = null;


    public TypeNotVoid getTypeNotVoids() {
        return typeNotVoids;
    }

    public void setTypeNotVoids(TypeNotVoid typeNotVoids) {
        this.typeNotVoids = typeNotVoids;
    }

    @Override
    public String toString() {
        return "Interfaces{"  + typeNotVoids.toString() +
                '}';
    }
}
