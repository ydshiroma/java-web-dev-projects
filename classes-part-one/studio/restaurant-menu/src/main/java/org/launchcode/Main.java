package org.launchcode;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
	// write your code here
        MenuItem flourlessChocolateCake = new MenuItem("Flourless Chocolate Cake", 5.00, "A dense, chocolatey cake", "dessert");
        System.out.println("Print menu item: ");
        System.out.println(flourlessChocolateCake);

        MenuItem galette = new MenuItem("Corn and Tomato Galette", 12.00, "A savory galette made of fresh corn and tomato", "main");
        MenuItem soup = new MenuItem("Potato Leek Soup", 8.00, "A creamy, savory soup", "appetizer", LocalDate.of(1994, 4, 25));

        Menu myMenu = new Menu();
        System.out.println(myMenu.getDateUpdated());
        myMenu.addItem(flourlessChocolateCake);
        myMenu.addItem(galette);
        myMenu.addItem(soup);

        System.out.println("getMenuItems: ");
        System.out.println(myMenu.getMenuItems());
        System.out.println("Print myMenu:");
        System.out.println(myMenu);

        myMenu.removeItem(flourlessChocolateCake);
        System.out.println("Print myMenu with item removed:");
        System.out.println(myMenu);
        System.out.println(myMenu.getDateUpdated());

        System.out.println("Is potato leek soup new?");
        System.out.println(soup.getNew());
        System.out.println("Is galette new?");
        System.out.println(galette.getNew());
    }
}
