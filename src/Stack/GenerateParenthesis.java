package Stack;

import java.util.ArrayList;
import java.util.List;

public class GenerateParenthesis
{
    public List<String> generateParenthesis(int n)
    {
        List<String> list = new ArrayList<>();
        recurse(list,0,0,"",n);
        return list;

    }

    public void recurse(List<String> list, int left, int right, String s, int n)
    {
        if (s.length()==n*2)
        {
            list.add(s);
            return;
        }

        if (left<n)
        {
            recurse(list,left+1,right,s+"(",n);
        }
        if (right<left)
        {
            recurse(list,left,right+1,s+")",n);
        }


    }
}
