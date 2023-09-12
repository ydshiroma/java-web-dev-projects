package org.launchcode;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;

public class Menu {
    private ArrayList<MenuItem> menuItems = new ArrayList<>();
    private LocalDate dateUpdated = LocalDate.now();

//    public Menu(ArrayList<MenuItem> menuItems, Date dateUpdated) {
//        this.menuItems = menuItems;
//        this.dateUpdated = dateUpdated;
//    }

    public Menu() {
        this.menuItems = menuItems;
        this.dateUpdated = dateUpdated;
    }

    public String toString() {
        String stringToReturn = "\n***MENU***\n\nAppetizers\n\n";
        for (MenuItem item : menuItems) {
            if (item.getCategory() == "appetizer") {
                stringToReturn += item.toString() + "\n\n";
            }
        }

        stringToReturn += "Main\n\n";
        for (MenuItem item : menuItems) {
            if (item.getCategory() == "main") {
                stringToReturn += item.toString() + "\n\n";
            }
        }

        stringToReturn += "Dessert\n\n";
        for (MenuItem item : menuItems) {
            if (item.getCategory() == "dessert") {
                stringToReturn += item.toString() + "\n\n";
            }
        }
        stringToReturn += "Menu last updated: " + dateUpdated + "\n";
        return stringToReturn;
    }

//    TODO: change this to use the method Carrie showed?

    public void addItem(MenuItem item) {
        menuItems.add(item);
        dateUpdated = LocalDate.now();
    }

    public void removeItem(MenuItem item) {
        menuItems.remove(item);
    }

    public ArrayList<MenuItem> getMenuItems() {
        return menuItems;
    }

    public LocalDate getDateUpdated() {
        return dateUpdated;
    }
}
