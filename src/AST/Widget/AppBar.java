package AST.Widget;

import Visitor.Helper;

public class AppBar extends Widget {
    String color = null ;
    Text text = null;
    public String widgetName = null;

    public String getWidgetName() {
        if (this.widgetName == null)
        {
            int num = 0;

            if (Helper.countTypeOfWidget.get("AppBar") != null) {
                num = Helper.countTypeOfWidget.get("AppBar") + 1;
                Helper.countTypeOfWidget.put("AppBar", num);

            }
            else
            {
                Helper.countTypeOfWidget.put("AppBar", num);
            }
            this.widgetName = "AppBar" + num;
        }
        return widgetName;
    }

}
