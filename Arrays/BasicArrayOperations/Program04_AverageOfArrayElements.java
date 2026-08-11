import java.util.*;
public class Program04_AverageOfArrayElements
{
    public static void main(String[] args)
    {
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter no of elements: ");
            int n=sc.nextInt();
            int sum=0;
            int[] arr=new int[n];
            System.out.println("Enter elements: ");
            for(int i=0;i<arr.length;i++)
            {
                arr[i]=sc.nextInt();
                sum+=arr[i];
            }
            System.out.println("Average of elements in the array: "+(sum/(float)n));

    }
}   
