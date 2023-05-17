package AST.ClassAndObject.Class;

import java.util.ArrayList;
import java.util.List;

public class Mixins {



    public List<TypeNotVoid> typeNotVoids = new ArrayList<>();

    public List<TypeNotVoid> getTypeNotVoids() {
        return typeNotVoids;
    }

    public void setTypeNotVoids(List<TypeNotVoid> typeNotVoids) {
        this.typeNotVoids = typeNotVoids;
    }

    @Override
    public String toString() {
        String str =  "Mixins{";
        for(TypeNotVoid e : this.typeNotVoids )
        {

            str = str + "\n" + e.toString() ;
        }
        return  str + typeNotVoids + "}";
    }
}
