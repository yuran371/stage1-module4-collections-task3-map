package com.epam.mjc.collections.map;

import java.util.HashMap;
import java.util.Map;

public class WordRepetitionMapCreator {
    public Map<String, Integer> createWordRepetitionMap(String sentence) {
    	String[] a =sentence.toLowerCase().split("\\s+|\\.|(\\,\\s)"); 
    	Map <String, Integer> hm = new HashMap<>();
    	if (sentence.isEmpty()) {
			return hm;
		}

    	for (int i=0; i<a.length; i++) {
    		if (hm.containsKey(a[i])) {
        	hm.put(a[i], hm.get(a[i])+1);
    		} 
    		 else {
        		hm.put(a[i], 1);
        		}
    	}

		return hm;
    }
}
