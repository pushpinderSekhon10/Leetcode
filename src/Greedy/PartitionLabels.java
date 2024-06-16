package Greedy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class PartitionLabels
{
    public static void main(String[] args) {
        partitionLabels("ababcbacadefegdehijhklij");
    }
    public static List<Integer> partitionLabels(String s)
    {
        int length = 0;
        int end = 0;
        HashMap<Character,Integer> hm = new HashMap<>();
        ArrayList<Integer> arr = new ArrayList<>();
        char[] x = s.toCharArray();

        for (int i =0; i<x.length; i++)
        {
            hm.put(x[i],i);
        }
        for (int i =0; i<x.length; i++)
        {
            if (end<hm.get(x[i]))
            {
                end = hm.get(x[i]);
            }
            length++;
            if (i== end)
            {

                arr.add(length);
                length=0;
            }
        }
        return arr;
    }
}
