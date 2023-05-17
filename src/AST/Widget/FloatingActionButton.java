package AST.Widget;

public class FloatingActionButton extends Button{

    Widget child = null;
    String Color = null;

    String link = null;


    public Widget getChild() {
        return child;
    }

    public void setChild(Widget child) {
        this.child = child;
    }

    public String getColor() {
        return Color;
    }

    public void setColor(String color) {
        Color = color;
    }

}
