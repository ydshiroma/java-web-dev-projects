package org.launchcode;

public class Main {

    public static void main(String[] args) {
	// write your code here
        MenuItem flourlessChocolateCake = new MenuItem("Flourless Chocolate Cake", 5.00, "A dense, chocolatey cake", "dessert");
        System.out.println(flourlessChocolateCake.getNew());
        System.out.println(flourlessChocolateCake.getDateAdded());
    }
}
