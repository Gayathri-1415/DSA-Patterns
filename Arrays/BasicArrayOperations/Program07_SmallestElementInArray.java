import java.util.*;
public class Program07_SmallestElementInArray
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
        int min=arr[0];
        for(int i=1;i<n;i++)
        {
            if(arr[i]<min)
                min=arr[i];
        }
        System.out.println("Smallest element in the array:  "+min);


    }
}
