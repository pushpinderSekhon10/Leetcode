package Greedy;

public class ValidParenthesisString
{
    public static void main(String[] args)
    {
        checkValidString("(((((*(()((((*((**(((()()*)()()()*((((**)())*)*)))))))(())(()))())((*()()(((()((()*(())*(()**)()(())");

    }
    public static boolean checkValidString(String s)
    {
        char[] x = s.toCharArray();
        int l = 0;
        int r = 0;
        int bonus = 0;

        for (int i = 0; i< x.length; i++)
        {
            switch (x[i])
            {
                case '(':
                {
                    l++;
                    break;
                }
                case ')':
                {
                    r++;
                    break;
                }
                case '*':
                {
                    bonus++;
                    break;
                }
            }
            if (r>l)
            {
                if (bonus>0)
                {
                    bonus--;
                }
                else
                {
                    return false;
                }
            }

        }
        if (r+bonus>=l)
        {
            return true;
        }
        return false;



    }
}
