package SymbolTableSructure;
import Visitor.Helper;

import  java.util.ArrayList;
import  java.util.List;

public class SymbolTable
{

    public Scope column = new Scope();
    public List<String> scopes = new ArrayList<>();
  //  public HashMap < String , details> FirstScope = new HashMap<>() ;

    public boolean parameter = false;

    List<String> errorMassages = new ArrayList<>();

    public List<String> getErrorMassages() {
        return errorMassages;
    }

    public void setErrorMassages(List<String> errorMassages) {
        this.errorMassages = errorMassages;
    }

    public Scope getColumn() {
        return column;
    }

    public void setColumn(Scope column) {
        this.column = column;
    }

    public void openScope(String scopeName)
    {
        this.scopes.add(scopeName);
    }

    public void closeScope(String scopeName)
    {
        this.scopes.remove(scopeName);
    }


    public void add2symbolTable(int line ,  String name , Details details )
    {
        if (!this.parameter )
        {
            List<String> copyList = new ArrayList<>();
            for (String s : this.scopes) {
                copyList.add(s);
            }
            Helper.SymbolTable_Add( copyList , this.column.getScope() ,null ,null , this.errorMassages , line , name , details );
        }
        return;

    }

    public String getValue( String name , String type)
    {
        if (!this.parameter )
        {
            List<String> copyList = new ArrayList<>();
            for (String s : this.scopes) {
                copyList.add(s);
            }
           // return Helper.SymbolTableGetValue(copyList, this.column.getScope() ,null,type, this.errorMassages , name);
        }
        return null;
    }


}
