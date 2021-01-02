package structural.proxy;

public class ProxyTest {

	public static void main(String[] args) {
		MediaHandlerImpl handler = new MediaHandlerImpl("The Lost World");
		
		MediaHandlerProxy adminProxy = new MediaHandlerProxy(handler, "Admin");
		MediaHandlerProxy operatorProxy = new MediaHandlerProxy(handler, "Operator");
		
		adminProxy.move();
		adminProxy.search();
		
		operatorProxy.search();
		operatorProxy.play();
		operatorProxy.delete(); 		

	}

}
