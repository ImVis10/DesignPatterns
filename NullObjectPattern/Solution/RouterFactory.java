package NullObjectPattern.Solution;

public class RouterFactory {

    public static Router getRouterForMessage(Message msg) {

        String priority = msg.getPriority() ;
        if (priority == null) {
            return new NullRouter();
        }

        switch (priority) {
            case "HIGH":
                return new SmsRouter();
            case "LOW":
                return new JmsRouter();
            default:
                return new NullRouter();
        }
    }
    
}
