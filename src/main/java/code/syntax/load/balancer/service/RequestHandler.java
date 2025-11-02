package code.syntax.load.balancer.service;

import code.syntax.load.balancer.model.ServerCapacity;

import java.util.Map;

public class RequestHandler {
    private ServerCache serverCache;

    public RequestHandler(ServerCache serverCache){
        this.serverCache = serverCache;
    }

    public void handleRequest(String request){
        Map<String, ServerCapacity> cache = serverCache.getCache();

        if(cache.isEmpty()){
            System.out.println("No available servers");
            return;
        }

        String serverName = ServerSelector.selectServer(cache);
        System.out.println("Forwarding request to server: " + serverName);
    }
}
