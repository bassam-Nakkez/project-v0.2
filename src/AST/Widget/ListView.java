package AST.Widget;

import java.util.ArrayList;
import java.util.List;

public class ListView extends Widget {

    List<Widget> items = new ArrayList<>();
    int ItemCount = 0 ;


    public List<Widget> getItems() {
        return items;
    }

    public void setItems(List<Widget> items) {
        this.items = items;
    }

    public int getItemCount() {
        return ItemCount;
    }

    public void setItemCount(int itemCount) {
        ItemCount = itemCount;
    }
}
