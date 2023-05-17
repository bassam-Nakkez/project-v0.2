package AST.ClassAndObject.Class;

public class SuperClass {


    public TypeNotVoid typeNotVoid = null;
    public Mixins mixins = null;


    public TypeNotVoid getTypeNotVoid() {
        return typeNotVoid;
    }

    public void setTypeNotVoid(TypeNotVoid typeNotVoid) {
        this.typeNotVoid = typeNotVoid;
    }

    public Mixins getMixins() {
        return mixins;
    }

    public void setMixins(Mixins mixins) {
        this.mixins = mixins;
    }

    @Override
    public String toString() {
        return "\n SuperClass{" + typeNotVoid.toString() + mixins.toString() + "}";
    }
}
