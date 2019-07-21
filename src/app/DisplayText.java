package app;

import java.util.HashMap;


public class DisplayText implements Handler{
    @Override
    public void handleIt(HashMap<String, Object> dataMap){
        System.out.println("Hopefully this meets the basic requirements");
    }
    
}
