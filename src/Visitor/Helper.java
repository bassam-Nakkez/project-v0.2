package Visitor;

import AST.Widget.Widget;
import SymbolTableSructure.Details;
import SymbolTableSructure.Scope;
import SymbolTableSructure.SymbolTable;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Helper
{
    public static  SymbolTable symbolTable = new SymbolTable();
    public static HashMap< String , Widget> widgets = new HashMap<String , Widget>();
    public static HashMap< String , Integer > countTypeOfWidget = new HashMap<String , Integer>();

    public HashMap< String , String > screens = new HashMap<>();


    public  static Set<String> navigatorClass = new HashSet<>();

    public  static Set<String> widgetClass = new HashSet<>();

    public static  HashMap<String,FileManagement>files = new HashMap<>();

    public static String currentHtmlName="";



    public static void SymbolTable_Add(List<String> scopes ,  HashMap<String, Details>  symbolTable , String ScopeName , String type , List<String> errorMassages , int line , String name, Details details)
    {


         if (scopes.isEmpty()) {

                    if (symbolTable.containsKey(name)) {
                        if (ScopeName != null){
                            errorMassages.add("Error ("+line+"): " + details.getType() + " '" + name + "' in "+ type+" " + ScopeName + " is already declared.");
                        }
                        else
                        {
                            errorMassages.add("Error ("+line+"): "+ details.getType() + " '" + name + "' is already declared.");
                        }
                    }

                    else {
                        symbolTable.put( name , details );
                    }
                return;
          }

        else if (!scopes.isEmpty() )
        {
            String item = null;
                for (String i : scopes ) { item = i;
                    break; }
            scopes.remove(item);
            if (symbolTable.containsKey(item) ) {

                    SymbolTable_Add(scopes , symbolTable.get(item).getScope()  ,item , symbolTable.get(item).getType() , errorMassages , line , name , details );

            }
            return;
        }
    }



//
//    public static String SymbolTableGetValue(List<String> scopes, HashMap<String, Details> symbolTable, String ScopeName, String type, List<String> errorMassages, String name)
//    {
//
////        if (scopes.isEmpty()) {
////            if (symbolTable.containsKey(name)) {
////                if (ScopeName != null){
////                    if(symbolTable.get(name).type == type)
////                    {
////                        return symbolTable.get(name).getValue();
////                    }
////
////                }
////            }
////            else {
////                return null;
////
////            }
////            return null;
////        }
////
////        else if (!scopes.isEmpty() )
////        {
////            String item = null;
////            for (String i : scopes ) { item = i;
////                break; }
////            scopes.remove(item);
////            if (symbolTable.containsKey(item)) {
////                SymbolTableGetValue(scopes , symbolTable.getScop ,item , symbolTable.get(item).getType() , errorMassages, name);
////
////            }
////            return null;
////        }
//       return null;
//
//    }
//

}

