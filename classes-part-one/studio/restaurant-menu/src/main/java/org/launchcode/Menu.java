package org.launchcode;

import java.util.ArrayList;
import java.util.Date;

public class Menu {
    private ArrayList<MenuItem> menuItems;
    private Date dateUpdated;

    public Menu(ArrayList<MenuItem> menuItems, Date dateUpdated) {
        this.menuItems = menuItems;
        this.dateUpdated = dateUpdated;
    }
}
