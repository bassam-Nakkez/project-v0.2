package AST.Widget;

public class Scaffold extends Widget {

    Widget appBar = null;
    Widget body   = null;

    FloatingActionButton floatingActionButton = null;


    public FloatingActionButton getFloatingActionButton() {
        return floatingActionButton;
    }

    public void setFloatingActionButton(FloatingActionButton floatingActionButton) {
        this.floatingActionButton = floatingActionButton;
    }

    public Widget getAppBar() {
        return appBar;
    }

    public void setAppBar(Widget appBar) {
        this.appBar = appBar;
    }


    public Widget getBody() {
        return body;
    }

    public void setBody(Widget body) {
        this.body = body;
    }
}
