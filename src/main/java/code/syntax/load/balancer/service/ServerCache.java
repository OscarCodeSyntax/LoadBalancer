package code.syntax.load.balancer.service;

import code.syntax.load.balancer.model.ServerCapacity;

import java.util.HashMap;
import java.util.Map;

public class ServerCache {

    private final Map<String, ServerCapacity> cache;

    public ServerCache(){
        cache = new HashMap<>();
    }

    public void addServer(String serverName, ServerCapacity load){
        cache.put(serverName, load);
    }

    public void updateLoad (String serverName, ServerCapacity load){
        cache.put(serverName, load);
    }

    public Map<String, ServerCapacity> getCache() {
        return cache;
    }
}