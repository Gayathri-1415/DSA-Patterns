import java.util.*;
public class Program03_SumOfArrayElements
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int sum=0;
        System.out.println("Enter no of elements: ");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter elements: ");
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
            sum+=arr[i];
        }
        System.out.println("Sum of elements in the array is "+sum);
        sc.close();

    }
}
