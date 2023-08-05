    Command cmd = getCommand();
    if (cmd != null) {
        cmd.execute();
    }

You've something like this in your codebase. It is a simple null check that prevents Null Pointer Exception (NPE). Now suppose, if you the number of conditionals become high, the code gets ugly , hard to read and error-prone.

Imagine we have a message router application. Each message should have a valid priority assigned. Our system is supposed to route high priority messages to an SMS gateway whereas messages with medium priority should be routed to a JMS queue.

From time to time, however, messages with “undefined” or empty priority might come to our application. Such messages should be discarded from further processing.

How to resolve this without using null checks?