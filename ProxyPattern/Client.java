package ProxyPattern;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class Client implements InvocationHandler {

	public static void main(String[] args) {
		Subject s = new Proxy();
		s.operation();
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		// TODO Auto-generated method stub
		return null;
	}

}
