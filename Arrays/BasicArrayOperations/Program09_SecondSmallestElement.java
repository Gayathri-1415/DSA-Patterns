import java.util.*;
public class Program09_SecondSmallestElement
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no of elements: ");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter elements: ");
        for(int i=0;i<n;i++)
            arr[i]=sc.nextInt();
        int smallest=Integer.MAX_VALUE,secondsmallest=Integer.MAX_VALUE;
        for(int i=0;i<n;i++)
        {
            if(arr[i]<smallest)
            {
                secondsmallest=smallest;
                smallest=arr[i];
            }
            else if(arr[i]<secondsmallest && arr[i]!=smallest)
            {
                secondsmallest=arr[i];
            }
        }
        if(secondsmallest!=Integer.MAX_VALUE)
            System.out.println("Second smallest element in the array "+secondsmallest);
        else
            System.out.println("No distinct second smallest exists");
    }
}
