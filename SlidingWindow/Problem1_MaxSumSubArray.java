import java.util.*;
public class Problem1_MaxSumSubArray {
    public static int maxSumSubArray(int[] arr,int k)
    {
        int n=arr.length;
        int windowsum=0;
        for(int i=0;i<k;i++)
        {
            windowsum+=arr[i];
        }
        int maxsum=windowsum;
        for(int i=k;i<n;i++)
        {
            windowsum= windowsum-arr[i-k]+arr[i];
            if(windowsum>maxsum)
                maxsum=windowsum;
        }
        return maxsum;
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter elements: ");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter value of k: ");
        int k=sc.nextInt();
        int result=maxSumSubArray(arr, k);
        System.out.println("Max sum of subarray of size "+k+" is: "+result);
    }
}
