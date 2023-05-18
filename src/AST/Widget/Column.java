package AST.Widget;

import java.util.ArrayList;
import java.util.List;

public class Column extends Widget {

    public List<Widget> children = new ArrayList<>();


    public List<Widget> getChildren() {
        return children;
    }

    public void setChildren(List<Widget> children) {
        this.children = children;
    }

}
