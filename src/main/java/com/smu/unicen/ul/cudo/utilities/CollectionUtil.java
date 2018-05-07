package com.smu.unicen.ul.cudo.utilities;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class CollectionUtil {
	
	public static <T> T[] concat(T[] first, T[] second) {
		  T[] result = Arrays.copyOf(first, first.length + second.length);
		  System.arraycopy(second, 0, result, first.length, second.length);
		  return result;
		}
	
	
	public static Map<Long, Double> sortByComparator(Map<Long, Double> unsortMap, final boolean order)
    {

        List<Entry<Long, Double>> list = new LinkedList<Entry<Long, Double>>(unsortMap.entrySet());

        Collections.sort(list, new Comparator<Entry<Long, Double>>()
        {
            public int compare(Entry<Long, Double> o1,
                    Entry<Long, Double> o2)
            {
                if (order)
                {
                    return o1.getValue().compareTo(o2.getValue());
                }
                else
                {
                    return o2.getValue().compareTo(o1.getValue());

                }
            }
        });

        // Maintaining insertion order with the help of LinkedList
        Map<Long, Double> sortedMap = new LinkedHashMap<Long, Double>();
        for (Entry<Long, Double> entry : list)
        {
            sortedMap.put(entry.getKey(), entry.getValue());
        }

        return sortedMap;
    }
}
