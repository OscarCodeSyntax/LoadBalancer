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

		//simple representation of a response that tracks server data.
		ServerCache serverCache = new ServerCache();
		ServerCapacity defaultServer1Capacity = new ServerCapacity(3);
		ServerCapacity defaultServer2Capacity = new ServerCapacity(3);
		ServerCapacity defaultServer3Capacity = new ServerCapacity(3);
		serverCache.addServer("Server 1", defaultServer1Capacity);
		serverCache.addServer("Server 2", defaultServer2Capacity);
		serverCache.addServer("Server 3", defaultServer3Capacity);

		RequestHandler requestHandler = new RequestHandler(serverCache);

		//These are simple representations of the http requests arriving
		//This would need to be multithreaded as we don't want this queuing.
		requestHandler.handleRequest("Req 1");
		requestHandler.handleRequest("Req 2");
		requestHandler.handleRequest("Req 3");
		requestHandler.handleRequest("Req 4");
		requestHandler.handleRequest("Req 5");
		requestHandler.handleRequest("Req 6");
		requestHandler.handleRequest("Req 7");
		requestHandler.handleRequest("Req 8");
		requestHandler.handleRequest("Req 9");
		requestHandler.handleRequest("Req 10");

	}
}