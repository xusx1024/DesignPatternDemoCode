package ProxyPattern;

public class Proxy extends Subject {

	@Override
	public void operation() {
		rs = new RealSubject();
		preOperation();
		rs.operation();
		afterOperation();

	}

	private RealSubject rs;

	private void preOperation() {
		System.out.println("pre opreation");
	}

	private void afterOperation() {
		System.out.println("after operation");
	}

}
