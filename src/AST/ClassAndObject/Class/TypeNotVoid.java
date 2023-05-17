package AST.ClassAndObject.Class;

import java.util.ArrayList;
import java.util.List;

public class TypeNotVoid {

    public String ID;
    public boolean Q = false;  // if ? it exists or not
    public List<String> IDs = new ArrayList<>();


    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public boolean isQ() {
        return Q;
    }

    public void setQ(boolean q) {
        Q = q;
    }

    public List<String> getIDs() {
        return IDs;
    }

    public void setIDs(List<String> IDs) {
        this.IDs = IDs;
    }

    @Override
    public String toString() {
        String str =  "TypeNotVoid{";
        for(String e : this.IDs )
        {

            str = str + "\n" + e.toString() ;
        }
        if (Q == true){
        return "TypeNotVoid{" + " +Q : TRUE "+ str + ID +"}";}
        else    return "TypeNotVoid{" + " +Q : False "+ str + ID +"}";
    }
}
