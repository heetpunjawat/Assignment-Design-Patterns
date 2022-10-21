package src;

public abstract class NodeVisitor {

	public abstract void visitFAcade(Facade F);

	public abstract void visitFacade(Facade F);

	public abstract Reminder visitTrading(Trading T);

	public abstract Reminder visitProduct(ClassProductList CL);
}

