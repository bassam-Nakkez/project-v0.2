import AST.Parse;
import Visitor.FileManagement;
import Visitor.Helper;
import Visitor.MyVisitor;
import alter.DartLexer;
import alter.DartParser;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.net.URI;

import static org.antlr.v4.runtime.CharStreams.fromFileName;


public class Main {
    public static void main(String[] args) throws IOException {

            CharStream charStream = fromFileName("Files/main.dart");
            Helper.currentHtmlName = "Files/main.dart";
            DartLexer lex = new DartLexer(charStream);
            CommonTokenStream tokens = new CommonTokenStream(lex);
            DartParser parser = new DartParser(tokens);
            ParseTree ast = parser.parse();
            MyVisitor myVisitor = new MyVisitor();
            Parse in = (Parse) myVisitor.visit(ast);
        if (Helper.symbolTable.getErrorMassages().isEmpty()) {

            try
            {
              //  String projectDir = System.getProperty("user.dir");
               //FileManagement.openFile("screen-1.php" );
                String fileName = Helper.currentHtmlName;
                fileName = fileName.substring(6 , fileName.length()-5);
                Desktop.getDesktop().browse(URI.create("http://localhost/gitHub//project-v0.2//"+fileName+".php"));


            }
            catch (Exception e) {
                System.out.println(e.getMessage());
            }

        }
        else {
            for (String Massage : Helper.symbolTable.getErrorMassages()) {
                System.out.println(Massage);
            }
        }
    }
}





