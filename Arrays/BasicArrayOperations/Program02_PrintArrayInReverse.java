import java.util.*;
public class Program02_PrintArrayInReverse
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
        System.out.println("Elements in reverse traversal");
        for(int j=n-1;j>=0;j--)
            System.out.println(arr[j]);
        sc.close();
    }
}
