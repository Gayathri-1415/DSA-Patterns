import java.util.*;
public class Program05_CountArrayElements
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no of elements: ");
        int n=sc.nextInt(),count=0;
        int[] arr=new int[n];
        System.out.println("Enter elements: ");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(int j:arr)
            count++;
        System.out.println("No of elements in array "+count);
        
    }
}
