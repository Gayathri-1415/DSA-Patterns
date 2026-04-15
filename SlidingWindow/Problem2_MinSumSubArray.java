import java.util.*;
public class Problem2_MinSumSubArray {
    public static int minSumSubArray(int[] arr,int k)
    {
        int n=arr.length;
        int windowsum=0;
        for(int i=0;i<k;i++)
        {
            windowsum+=arr[i];
        }
        int minsum=windowsum;
        for(int i=k;i<n;i++)
        {
            windowsum=windowsum-arr[i-k]+arr[i];
            if(windowsum<minsum)
                minsum=windowsum;
        }
        return minsum;

    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no of elements: ");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter elements: ");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter k value: ");
        int k=sc.nextInt();
        System.out.println("Min sum of sub array of size "+k+" is: "+minSumSubArray(arr, k));
    }
}
