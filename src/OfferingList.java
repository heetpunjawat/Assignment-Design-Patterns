package src;
import java.util.ArrayList;
import java.util.Iterator;

public class OfferingList {

	ArrayList<String> meat = new ArrayList<>();
	ArrayList<String> produce = new ArrayList<>();

	OfferingList() {
		meat.add("Tutu : Beef");
		meat.add("Mimi : Beef");
		meat.add("Pepe : Beef");
		produce.add("Tutu : Tomato");
		produce.add("Mimi : Onion");
		produce.add("Pepe : Tomato");
		produce.add("Pepe : Onion");
	}

	@SuppressWarnings("rawtypes")
	public Iterator createIterator() {
		return this.meat.iterator();
	}
}