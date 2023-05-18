package AST.Widget;

import java.util.ArrayList;
import java.util.List;

public class Center extends Widget {

    Widget child = null;

    public Widget getChild() {
        return child;
    }

    public void setChild(Widget child) {
        this.child = child;
    }
}
