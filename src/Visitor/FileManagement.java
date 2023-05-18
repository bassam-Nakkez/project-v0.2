package Visitor;
import java.awt.*;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.net.URI;
import java.util.HashMap;

public  class FileManagement {

    public static String  CssCode="\n";

    public static HashMap< String , String > htmlFiles = new HashMap<>();
    public static void CreateFile (String path) {
        try {
            java.io.File myObj = new java.io.File(path);
            if (myObj.createNewFile()) {
                System.out.println("File created: " + myObj.getName());
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

    public static void writeToTheFile(  String path , String str ) {
        try {
            FileWriter myWriter = new FileWriter(path , false);
            myWriter.write(str);
            myWriter.close();
        //    System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

    public static void openFile(String str) throws IOException {
       java.io.File htmlFile = new java.io.File(str);
        //Desktop.getDesktop().browse(URI.create(str));
        Desktop.getDesktop().browse(htmlFile.toURI());
    }


    public static void Overwrite(String str )  throws IOException
    {

        boolean appendFile = false ;

        File fnew = new File(str);

        // System.out.println(source);
        FileWriter f2;

        try {
            //change this line to read this

            // f2 = new FileWriter(fnew,false);

            // to read this
            f2 = new FileWriter(fnew , appendFile); // important part
            f2.write(str);

            // change field back to true so the rest of the new data will
            // append to the new file.

            appendFile = true;

            f2.close();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    public static void addToCssFile(String code)
    {
        CssCode += code;
    }
    public static void addToHtmlFile( String currentFile , String code)
    {
        String htmlCode ="";
        if(htmlFiles.get(currentFile) != null) {
         htmlCode = htmlFiles.get(currentFile);
            }else
            {
                htmlCode = "\t <?php session_start();?> \n <html><head>\n" +
                        "                    <meta charset=\"UTF-8\">\n" +
                        "                    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n" +
                        "                    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n" +
                        "                    <link rel=\"stylesheet\" href=\"style.css\">\n" +
                        "                    <title> bbbbbbbbbb </title>\n" +
                        "                </head>\n" +
                        "                <body>";
            }
        htmlCode += code;
        htmlFiles.put(currentFile , htmlCode );
    }

}
