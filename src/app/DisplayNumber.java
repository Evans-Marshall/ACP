package app;

import java.util.HashMap;


public class DisplayNumber implements Handler{
    @Override
    public void handleIt(HashMap<String, Object> dataMap){
        System.out.println("42");
    }
}
