package src;

public class PersonFactory extends Person {

    PersonFactory(ProductMenu theProductMenu) {
        super(theProductMenu);
    }

    @Override
    public void ShowMenu() {}

    @Override
    public ProductMenu createProductMenu() {
        return null;
    }

    public static Person createObject(String str) {

        System.out.println("Factory Pattern Intiated for user creation....");

        Person person;
        if (str.equalsIgnoreCase("Buyer")) {
            person = new Buyer();
        }
        else{
            person = new Seller();
        }

        return person;
    }
}
