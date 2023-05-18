package AST;

import java.util.ArrayList;
import java.util.List;

public class Node {

    String nodeName;
    int lineNumber;
    int childCount;
    //var node_value;
    Object parent;
    List<Object> sibling = new ArrayList<>();
    Object leftMostChild;

    public String getNodeName() {
        return nodeName;
    }

    public void setNodeName(String nodeName) {
        this.nodeName = nodeName;
    }

    public int getLineNumber() {
        return lineNumber;
    }

    public void setLineNumber(int lineNumber) {
        this.lineNumber = lineNumber;
    }

    public int getChildCount() {
        return childCount;
    }

    public void setChildCount(int childCount) {
        this.childCount = childCount;
    }

    public Object getParent() {
        return parent;
    }

    public void setParent(Object parent) {
        this.parent = parent;
    }

    public List<Object> getSibling() {
        return sibling;
    }

    public void setSibling(List<Object> sibling) {
        this.sibling = sibling;
    }

    public Object getLeftMostChild() {
        return leftMostChild;
    }

    public void setLeftMostChild(Object leftMostChild) {
        this.leftMostChild = leftMostChild;
    }



}
