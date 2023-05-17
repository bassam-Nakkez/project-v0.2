package AST.Array;


public class decpartArray extends Array {
    TypeArray Type;
    String Name;

    public decpartArray( TypeArray Type , String Name ){
        this.Type = Type;
        this.Name = Name;

    }

    @Override
    public String toString() {

        return "\n decpartArray{" +  Type.toString()+ Name + '\'' +
                '}';
    }
}
