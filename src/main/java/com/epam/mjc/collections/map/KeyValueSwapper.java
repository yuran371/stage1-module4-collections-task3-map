package com.epam.mjc.collections.map;

import java.util.HashMap;
import java.util.Map;

public class KeyValueSwapper {
    public Map<String, Integer> swap(Map<Integer, String> sourceMap) {
    	Map<String, Integer> hm = new HashMap<>();
    	if (sourceMap.isEmpty()) {
			return hm;
		}
    	int keyint=0;
    	String valuestring ="";

    		
    		


    	for (Map.Entry<Integer, String> entry : sourceMap.entrySet()) {
    		keyint=entry.getKey();
    		valuestring=entry.getValue();
        	if (sourceMap.containsValue(valuestring))	{
        		if (entry.getKey()<hm.get) {
        			hm.put(b, entry.getKey());
        		}
        	} else {
        	hm.put(valuestring, entry.getKey());
        	}
    	}
		return hm;
    	
    }
}
