package ArraysAndHashing;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class GroupAnagrams
{
    public List<List<String>> groupAnagrams(String[] strs)
    {
        HashMap<String,List> hm = new HashMap<>();
        for (String s: strs)
        {
            char[] ca = s.toCharArray();
            Arrays.sort(ca);
            String sortedWord = new String(ca);
            hm.putIfAbsent(sortedWord,new ArrayList<>());
            hm.get(sortedWord).add(s);
        }
        return new ArrayList<>(hm.values());
    }
}
