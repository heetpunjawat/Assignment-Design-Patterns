package src;
import java.util.Iterator;
import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class Facade {

	String[] userDetails;
	String UserName;
	int UserType;
	int theSelectProduct;
	int nProductCategory;
	int theProductList;
	int thePerson;

	public void beginFacade() {

		System.out.println("Facade pattern initiated ");

		userDetails = login(new Login());
		UserType = parseInt(userDetails[0]);
		UserName = userDetails[1];

		Scanner scanner = new Scanner(System.in);

		System.out.println(
				"Select from available Course Menus \n 1. Meat Product Menu \n 2. Produce Product Menu \n " +
						"Enter 1 or 2 to proceed: ");
		theSelectProduct =  parseInt(scanner.nextLine());

		//Bridge and Factory pattern implementation
		if (theSelectProduct == 1) {
			selectProduct(new MeatProductMenu(), UserType);
		}
		else if (theSelectProduct == 2) {
			selectProduct(new ProduceProductMenu(), UserType);
		}
		else {
			System.out.println("Wrong Selection");
			System.exit(-1);
		}

		//Visitor pattern implementation
		System.out.println("Implementing Visitor Pattern....");
		remind();

		//Iterator pattern implementation
		System.out.println("Implementing Iterator pattern ....");

		ClassProductList products = new ClassProductList(userDetails[1], theSelectProduct);
		@SuppressWarnings("rawtypes")
		Iterator iterate = (Iterator) products.createIterator();
		ProductIterator ProductIterator = new ProductIterator();

		while (ProductIterator.HasNext(iterate)) {
			System.out.println(ProductIterator.Next(iterate));
		}
		scanner.close();
	}

	public String[] login(Login object) {
		return object.login();
	}

	public void addTrading(TradingMenu TM) {
		TM.addTrading();
	}

	public void viewTrading(TradingMenu VM) {
		VM.viewTrading();
	}

	public void viewOffering(OfferingMenu OM) {
		OM.viewOffering();
	}

	public void markOffering(OfferingMenu OM) {
		OM.markOffering();
	}

	public void submitOffering(OfferingMenu OM) {
		OM.submitOffering();
	}

	public void remind() {
		ReminderVisitor remind = new ReminderVisitor();

	}

	public void createUser(UserInfoItem userinfoitem) {
		userinfoitem.createUSer();
	}

	public void createProductList(ProductMenu PM) {
		PM.createProductList();
	}

	public void attachProductToUser(ProductMenu PM) {
		PM.attachProductToUser();

	}

	public void selectProduct(ProductMenu PM, int UserType) {
		PM.selectProduct(UserType);
	}

	public void productOperation(ProductMenu PM) {
		PM.productOperation();
	}

}
