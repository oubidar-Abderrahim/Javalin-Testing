package javalintesting.helloworld;

import io.javalin.Context;
import io.javalin.Handler;

public class CustomHello implements Handler {

	@Override
	public void handle(Context ctx) throws Exception {
		
		ctx.result("Hello from Custom Handler");
	}

}
