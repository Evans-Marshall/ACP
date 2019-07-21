package app;

import java.util.HashMap;


public class DisplayName implements Handler{
    @Override
    public void handleIt(HashMap<String, Object> dataMap){
        System.out.println("Marshall");
    }
}
