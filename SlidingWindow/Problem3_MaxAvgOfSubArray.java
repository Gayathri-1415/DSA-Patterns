import java.util.*;
class Main
{
    public double MaxAvg(int[] arr,int k)
    {
        int windowsum=0;
        double maxavg=0;
        for(int i=0;i<arr.length;i++)
        {
            windowsum+=arr[i];
            if(i>=k-1)
            {
                if(windowsum/k>maxavg)
                    maxavg=windowsum/(float)k;
                windowsum-=arr[i-k+1];
            }
        }
        return maxavg;
    }
}
public class Problem3_MaxAvgOfSubArray
{
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
        Main m=new Main();
        System.out.println("Max avg of subarray: "+m.MaxAvg(arr, k));
    }
}
