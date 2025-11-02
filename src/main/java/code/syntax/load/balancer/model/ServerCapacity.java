package code.syntax.load.balancer.model;

public class ServerCapacity {

    int maxCapacity;
    int currentLoad;

    public ServerCapacity(int maxCapacity){
        this.maxCapacity = maxCapacity;
        this.currentLoad = 0;
    }

    public int getMaxCapacity() {
        return maxCapacity;
    }

    public int getCurrentLoad() {
        return currentLoad;
    }

    public void setMaxCapacity(int maxCapacity) {
        this.maxCapacity = maxCapacity;
    }

    public void setCurrentLoad(int currentLoad) {
        this.currentLoad = currentLoad;
    }

    public void incrementLoad () {
        currentLoad++;
    }
}
