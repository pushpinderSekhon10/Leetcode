package Stack;

import java.util.Stack;

public class ValidParenthesis
{
    public boolean isValid(String s)
    {
        char[]c = s.toCharArray();
        Stack<Character> stack = new Stack<>();

        for (char x : c)
        {
            if (x=='(')
            {
                stack.push(')');
            }
            else if (x=='[')
            {
                stack.push(']');
            }
            else if (x=='{')
            {
                stack.push('}');
            }
            else if (stack.isEmpty() || stack.pop()!=x)
            {
                return false;

            }




        }
        return stack.isEmpty();
    }
}
