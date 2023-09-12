package org.launchcode;

import java.time.LocalDate;
import java.time.Period;

public class MenuItem {
    private String name;
    private double price;
    private String description;
    private String category;
    private LocalDate dateAdded;
    private Boolean isNew;

    public MenuItem(String name, double price, String description, String category, LocalDate dateAdded) {
        this.name = name;
        this.price = price;
        this.description = description;
        this.category = category;
        this.dateAdded = dateAdded;
        this.isNew = isNew = getNew();
    }

    public MenuItem(String name, double price, String description, String category) {
        this.name = name;
        this.price = price;
        this.description = description;
        this.category = category;
        this.dateAdded = LocalDate.now();
        this.isNew = getNew();
    }

    public String toString() {
        String newString;
        return name + " ($" + price + ", " + category + "): " + description + ". Added " + dateAdded;
    }

//    TODO: print whether the item is new instead of date added
//    TODO: show price with correct number of decimal places. make a printPrice method that checks how many digits are after . and adds a $?

//    TODO: equals method

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCategory() {
        return category;
    }

//    TODO: check that category is valid?

    public void setCategory(String category) {
        this.category = category;
    }

    public LocalDate getDateAdded() {
        return dateAdded;
    }

    public void setDateAdded(LocalDate dateAdded) {
        this.dateAdded = dateAdded;
    }

    public Boolean getNew() {
        LocalDate todaysDate = LocalDate.now();
        Period diff = Period.between(dateAdded, todaysDate);
        if (diff.getMonths() > 1 || diff.getYears() >= 1) {
            isNew = false;
        } else {
            isNew = true;
        }
        return isNew;
    }

    public void setNew(Boolean aNew) {
        isNew = aNew;
    }

}
