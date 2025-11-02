package code.syntax.load.balancer;

import code.syntax.load.balancer.model.ServerCapacity;
import code.syntax.load.balancer.service.RequestHandler;
import code.syntax.load.balancer.service.ServerCache;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
//		SpringApplication.run(Application.class, args);

		ServerCache serverCache = new ServerCache();
		ServerCapacity defaultServer1Capacity = new ServerCapacity(3);
		ServerCapacity defaultServer2Capacity = new ServerCapacity(3);
		ServerCapacity defaultServer3Capacity = new ServerCapacity(3);
		serverCache.addServer("Server 1", defaultServer1Capacity);
		serverCache.addServer("Server 2", defaultServer2Capacity);
		serverCache.addServer("Server 3", defaultServer3Capacity);

		RequestHandler requestHandler = new RequestHandler(serverCache);
		requestHandler.handleRequest("Req 1");
		requestHandler.handleRequest("Req 2");
		requestHandler.handleRequest("Req 3");
		requestHandler.handleRequest("Req 4");
		requestHandler.handleRequest("Req 5");		requestHandler.handleRequest("Req 1");
		requestHandler.handleRequest("Req 2");
		requestHandler.handleRequest("Req 3");
		requestHandler.handleRequest("Req 4");
		requestHandler.handleRequest("Req 5");		requestHandler.handleRequest("Req 1");
		requestHandler.handleRequest("Req 2");
		requestHandler.handleRequest("Req 3");
		requestHandler.handleRequest("Req 4");
		requestHandler.handleRequest("Req 5");		requestHandler.handleRequest("Req 1");
		requestHandler.handleRequest("Req 2");
		requestHandler.handleRequest("Req 3");
		requestHandler.handleRequest("Req 4");
		requestHandler.handleRequest("Req 5");		requestHandler.handleRequest("Req 1");
		requestHandler.handleRequest("Req 2");
		requestHandler.handleRequest("Req 3");
		requestHandler.handleRequest("Req 4");
		requestHandler.handleRequest("Req 5");
	}


}
