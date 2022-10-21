package src;

public class Seller extends Person {
    Seller() {
        super(theProductMenu);
    }

    Seller(ProductMenu theProductMenu) {
        super(theProductMenu);
    }

    @Override
    public void ShowMenu() {
        System.out.println("Seller Menu items....");

    }

    @Override
    public ProductMenu createProductMenu() {
        String test = "Meat Product";
        if (test.equalsIgnoreCase("Meat Product")) {
            return new MeatProductMenu();
        } else {
            return new ProduceProductMenu();
        }
    }

}
