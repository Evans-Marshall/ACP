package app;


import java.util.HashMap;

public class AppControl {

    private static HashMap<String, Handler> handlerMap = new HashMap();

    public static void handleRequest(String command, HashMap<String, Object> data) {
        Handler aCommandHandler = handlerMap.get(command);
        if (aCommandHandler != null) {
            aCommandHandler.handleIt(data);
        }
    }

    public static void mapCommand(String aCommand, Handler acHandler) {
        handlerMap.put(aCommand, acHandler);
    }
}
