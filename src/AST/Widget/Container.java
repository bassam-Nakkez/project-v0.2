package AST.Widget;

import Visitor.Helper;
import com.sun.net.httpserver.Headers;

public class Container extends  Widget {

    public String widgetName = null;
    Widget child = null;

    public String getWidgetName() {
        if (this.widgetName == null)
        {
            int num = 0;

            if (Helper.countTypeOfWidget.get("Container") != null) {
                num = Helper.countTypeOfWidget.get("Container") + 1;
                Helper.countTypeOfWidget.put("Container", num);

            }
            else
            {
                Helper.countTypeOfWidget.put("Container", num);
            }
            this.widgetName = "Container" + num;
        }
        return widgetName;
    }


    public void setWidgetName(String widgetName) {

        this.widgetName = widgetName;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public Widget getChild() {
        return child;
    }

    public void setChild(Widget child) {
        this.child = child;
    }


    public String buildCode() {


        if (this.child != null ){
            return "<div class ='"+this.widgetName+"' >"+this.child.buildCode()+"</div>";
        }
        return "<div class =\""+this.widgetName+"\" ></div>";

    }

}
