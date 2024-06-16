package Greedy;

import java.util.ArrayList;

public class MergeThreeTripletsToFormTargetTriplet
{
    public static void main(String[] args) {
        int[][] x = {{2,5,3},{1,8,4},{1,7,5}};
        int[] y = {2,7,5};
        System.out.println(mergeTriplets(x,y));
    }
    public static boolean mergeTriplets(int[][] triplets, int[] target)
    {
        Boolean p1 = false;
        Boolean p2 = false;
        Boolean p3 = false;
        ArrayList<int[]> arr = new ArrayList<>();
        for (int i = 0; i< triplets.length; i++)
        {
            if (triplets[i][0]<=target[0] && triplets[i][1]<=target[1] && triplets[i][2]<=target[2])
            {
                arr.add(triplets[i]);
            }
        }
        for (int[] x : arr)
        {
            if (x[0]==target[0])
            {
                p1 = true;
            }
            if (x[1]==target[1])
            {
                p2 = true;
            }
            if (x[2]==target[2])
            {
                p3 = true;
            }
        }
        if (p1&&p2&&p3)
        {
            return true;
        }
        return false;

    }
}
