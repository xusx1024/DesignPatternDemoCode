package FlyweightPattern;

public class Client {

	public static void main(String[] args) {
		FlyweightFactory factory = new FlyweightFactory();
		Flyweight fly = factory.factory('a');
		fly.operation("1st");

		fly = factory.factory('b');
		fly.operation("2end");

		fly = factory.factory('a');
		fly.operation("3rd");
	}

}
