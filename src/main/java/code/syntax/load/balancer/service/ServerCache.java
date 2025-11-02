package code.syntax.load.balancer.service;

import code.syntax.load.balancer.model.ServerCapacity;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class ServerCache {

    private final ConcurrentHashMap<String, ServerCapacity> cache;

    public ServerCache(){
        cache = new ConcurrentHashMap<>();
    }

    public void addServer(String serverName, ServerCapacity load){
        cache.put(serverName, load);
    }

    public void updateLoad (String serverName, ServerCapacity load){
        cache.put(serverName, load);
    }

    public ConcurrentHashMap<String, ServerCapacity> getCache() {
        return cache;
    }
}