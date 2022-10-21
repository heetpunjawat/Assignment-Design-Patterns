package src;

public class Buyer extends Person {
	Buyer() {
		super(theProductMenu);
	}

	Buyer(ProductMenu theProductMenu) {
		super(theProductMenu);
	}

	@Override
	public void ShowMenu() {
		System.out.println("Buyer Menu items ....");

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

