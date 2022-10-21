package src;

public class ReminderVisitor extends NodeVisitor {
	String m_Reminder;

	@Override
	public void visitFAcade(Facade F) {
		System.out.println("visiting Facade ....");
	}

	@Override
	public void visitFacade(Facade F) {

	}

	@Override
	public Reminder visitTrading(Trading T) {
		System.out.println("visiting Trading ....");
		return T;
	}

	@Override
	public Reminder visitProduct(ClassProductList CL) {
		System.out.println("visiting Course ....");
		return CL;
	}

}
