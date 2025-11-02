package code.syntax.load.balancer.service;

import code.syntax.load.balancer.model.ServerCapacity;

import java.util.Map;

public class ServerSelector {

    public static String selectServer(Map<String, ServerCapacity> cache){
        String selectedServer = null;
        ServerCapacity selectedLoad = null;

        //logic doesn't seem to count the requests???

        //Placeholder value to start the balancing logic.
        //On the first loop will be set to track the highest load on each server.
        int minLoad = Integer.MAX_VALUE;

        for(Map.Entry<String, ServerCapacity> entry: cache.entrySet()){
            String serverName = entry.getKey();
            ServerCapacity load = entry.getValue();

            //minLoad represents the service lowest request number.
            //loops through all available cached services and works out which one has the lowest load.
            if(load.getCurrentLoad() < minLoad) {
                minLoad = load.getCurrentLoad();
                selectedServer = serverName;
                selectedLoad = load;
            }
        }

        if(selectedLoad != null && selectedServer != null){
            selectedLoad.incrementLoad();

            if(selectedLoad.getCurrentLoad() > selectedLoad.getMaxCapacity()){
                return "Servers at max capacity";
            } else if (selectedLoad.getCurrentLoad() == selectedLoad.getMaxCapacity() - 1){
                System.out.println("One request away from max capacity : " + selectedServer);
            }
            //returns the server that has the lowest no of req.
            return selectedServer;
        } else {
            return "null server values";
        }

    }

}