package AST.Widget;

import Visitor.Helper;

public class Text extends Widget{
    public String widgetName = null;

    public String color;
    public String fontFamily;
    public String fontSize;
    public String data;


    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getFontFamily() {
        return fontFamily;
    }

    public void setFontFamily(String fontFamily) {
        this.fontFamily = fontFamily;
    }

    public String getFontSize() {
        return fontSize;
    }

    public void setFontSize(String fontSize) {
        this.fontSize = fontSize;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getWidgetName() {

        if (this.widgetName == null)
        {
            int num = 0;
            if(Helper.countTypeOfWidget.get("Text") == null)
            {
                Helper.countTypeOfWidget.put("Text",num);
            }
            else
            {
                num = Helper.countTypeOfWidget.get("Text") + 1 ;
                Helper.countTypeOfWidget.put("Text",num);
            }
            this.widgetName = "Text"+num;
        }
        return widgetName;
    }

    public void setWidgetName(String widgetName) {
        this.widgetName = widgetName;
    }
}
