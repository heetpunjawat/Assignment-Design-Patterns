package src;

import java.util.Scanner;

public class Facade {

	private int UserType;
	private int theSelectedProduct;
	private int nProductCategory;
	private int theProductList;
	private int thePerson;

	public void beginFacade() {

		System.out.println("Facade pattern started ");

		Scanner scanner = new Scanner(System.in);

		System.out.println("Choose from two menu options: \n 1. Meat Product Menu \n 2. Produce Product Menu ");
		theSelectedProduct = Integer.parseInt(scanner.nextLine());

		// Bridge pattern and factory pattern implementation
		if (theSelectedProduct == 1) {
			SelectProduct(new HighLevelCourseMenu(), UserType);
		}

		else if (theSelectedProduct == 2) {
			SelectProduct(new LowLevelCourseMenu(), UserType);
		}

		else {
			System.out.println("Please enter correct integer ");
			System.exit(-1);
	}

	public int login() {
		return ;
	}

	public void addTrading() {

	}

	public void viewTrading() {

	}

	public void decideBidding() {

	}

	public void discussBidding() {

	}

	public void submitBidding() {

	}

	public void remind() {

	}

	public void createUser(UserInfoItem userinfoitem) {

	}

	public void createProductList() {

	}

	public void AttachProductToUser() {

	}

	public int SelectProduct() {
		return 0;
	}

	public void productOperation() {

	}

}
