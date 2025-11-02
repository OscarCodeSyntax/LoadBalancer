package code.syntax.load.balancer.service;

public class RequestRunnable implements Runnable {

    String request;
    RequestHandler requestHandler;

        public RequestRunnable(String request, RequestHandler requestHandler) {
            this.requestHandler = requestHandler;
this.request = request;        }

        public void run() {
            requestHandler.handleRequest(request);
        }

}
