package AST.Array;


public class decArray extends Array {
    TypeArray Type;
    String Name;

  public decArray( TypeArray Type , String Name ){
      this.Type = Type;
      this.Name = Name;

  }
    @Override
    public String toString() {
        return "\n decArray{" + Type.toString() + Name  + "}";
    }
}
