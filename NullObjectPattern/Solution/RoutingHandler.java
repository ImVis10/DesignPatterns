package NullObjectPattern.Solution;

public class RoutingHandler {
    
    public void handle(Iterable<Message> msgs) {
        for (Message msg : msgs) {
            Router router = RouterFactory.getRouterForMessage(msg);
            router.route(msg);
        }
    }
}
