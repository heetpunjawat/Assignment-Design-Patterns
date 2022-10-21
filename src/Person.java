package src;

public abstract class Person {
	protected static ProductMenu theProductMenu;

	public abstract void ShowMenu();

	public abstract ProductMenu createProductMenu();

	@SuppressWarnings("static-access")
	Person(ProductMenu theProductMenu) {
		this.theProductMenu = theProductMenu;
	}

	public void showAddButtons() {
		theProductMenu.ShowAddButtons();
	}

	public void showViewButtons() {

		theProductMenu.ShowViewButtons();
	}

	public void showRadios() {
		theProductMenu.ShowRadios();
	}

	public void showCombos() {
		theProductMenu.showComboxes();
	}

	public void showLabels() {
		theProductMenu.ShowLabels();
	}
}
