package NullObjectPattern.Solution;

import java.util.Arrays;
import java.util.List;

public class Client {

    public static void main(String[] args) {
        Message highPrioMsg = new Message("Alert!!!", "HIGH");
        Message lowPrioMsg = new Message("Alert!!!", "LOW");
        Message nullPrioMsg = new Message("Alert!!!", null);
        Message otherPrioMsg = new Message("Alert!!!", "OTHER");

        List<Message> msgs = Arrays.asList(highPrioMsg, lowPrioMsg, nullPrioMsg, otherPrioMsg);

        RoutingHandler routingHandler = new RoutingHandler();
        routingHandler.handle(msgs);
    }
    
}
