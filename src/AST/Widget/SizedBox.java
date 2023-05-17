package AST.Widget;

import Visitor.Helper;

public class SizedBox extends Widget {

    String width = null;
    String height = null;

    Widget child = null;

    public Widget getChild() {
        return child;
    }

    public void setChild(Widget child) {
        this.child = child;
    }

    String widgetName = null;

    public String getWidth() {
        return width;
    }

    public void setWidth(String width) {
        this.width = width;
    }

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    public String getWidgetName ()
    {
        if (this.widgetName == null)
        {
            int num = 0;

            if (Helper.countTypeOfWidget.get("SizedBox") != null) {
                num = Helper.countTypeOfWidget.get("SizedBox") + 1;
                Helper.countTypeOfWidget.put("SizedBox", num);

            }
            else
            {
                Helper.countTypeOfWidget.put("SizedBox", num);

            }
            this.widgetName = "SizedBox" + num;
        }
        return widgetName;
    }



}
