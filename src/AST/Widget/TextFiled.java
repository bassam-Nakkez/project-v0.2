package AST.Widget;

import Visitor.Helper;

public class TextFiled extends Widget{


    public String labelText="";
    public String widgetName = null;

    public String getWidgetName() {
        if (this.widgetName == null)
        {
            int num = 0;

            if (Helper.countTypeOfWidget.get("TextFiled") != null) {
                num = Helper.countTypeOfWidget.get("TextFiled") + 1;
                Helper.countTypeOfWidget.put("TextFiled", num);

            }
            else
            {
                Helper.countTypeOfWidget.put("TextFiled", num);
            }
            this.widgetName = "TextFiled" + num;
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


    public String buildCode() {

        return "<label style=\" display:block;\" for=\""+widgetName+"\">"+labelText+"</label>"+
                "<input id=\""+ widgetName+"\" type=\"text\">";

    }

}
