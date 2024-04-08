package moe.shan;

import java.util.HashMap;
import java.util.Map;

class Facts {
    private Map<String,String> facts = new HashMap<>();

    public String getFact(String name){
        return facts.get(name);
    }

    public void setFact(String name,String value){
        facts.put(name,value);
    }

}
