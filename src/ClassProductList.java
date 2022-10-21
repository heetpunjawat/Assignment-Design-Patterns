package src;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

@SuppressWarnings("rawtypes")
public class ClassProductList extends Reminder {

	ArrayList<String> productList = new ArrayList<>();


	HashMap<String, HashMap<String, String[]>> userProductMap = new HashMap<String, HashMap<String, String[]>>();



	ClassProductList(String username, int theSelectProduct) {


		userProductMap.put("tutu", new HashMap<String, String[]>());
		String[] temp = {"Beef"};
		userProductMap.get("tutu").put("meat", temp.clone());
		temp[0] = "Tomato";
		userProductMap.get("tutu").put("produce", temp.clone());

		userProductMap.put("mimi", new HashMap<String, String[]>());
		temp[0] = "Beef";
		userProductMap.get("mimi").put("meat", temp.clone());
		temp[0] = "Onion";
		userProductMap.get("mimi").put("produce", temp.clone());

		userProductMap.put("pepe", new HashMap<String, String[]>());
		temp[0] = "Beef";
		userProductMap.get("pepe").put("meat", temp.clone());
		String[] temp2 = {"Tomato", "Onion"};
		userProductMap.get("pepe").put("produce", temp2.clone());

		if(theSelectProduct == 1) {
			for (int i = 0; i < userProductMap.get(username).get("meat").length; i++) {
				productList.add(userProductMap.get(username).get("meat")[i]);
			}
		}
		else {
			for (int i = 0; i < userProductMap.get(username).get("produce").length; i++) {
				productList.add(userProductMap.get(username).get("produce")[i]);
			}
		}
	}


	public Iterator createIterator() {
		return this.productList.iterator();
	}

	public Reminder accept(NodeVisitor nodeVisitor) {
		System.out.println("Product List Reminder ...");
		return nodeVisitor.visitProduct(this);
	}

}

