package BinarySearch;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

/**
 * Your TimeMap object will be instantiated and called as such:
 * TimeMap obj = new TimeMap();
 * obj.set(key,value,timestamp);
 * String param_2 = obj.get(key,timestamp);
 */

public class TimeBasedKeyValueStore
{
    /**
    Map<String, TreeMap<String,Integer>> map;

    public TimeMap()
    {
        map = new HashMap<>();
    }

    public void set(String key, String value, int timestamp)
    {
        TreeMap<String,Integer> tm = map.getOrDefault(key,newTreeMap<>());
        tm.put(timestamp,value);
        map.put(key,tm);
    }

    public String get(String key, int timestamp)
    {
        if(!map.containsKey(key)) return "";
        TreeMap<Integer,String> tm = map.get(key);
        Map.Entry<Integer,String> e = tm.floorEntry(timeStamp);
        if(e==null) return "";
        else return e.getValue();
    }
     */
}
