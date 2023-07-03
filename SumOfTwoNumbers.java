import java.util.*;

public class SumOfTwoNumbers {  
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int size;
        System.out.println("Enter the size of the array:");
        size = sc.nextInt();
        int arr[] = new int[size];
        int sum = 0;
        System.out.println("Enter the array elements:");
        for(int i=0;i<size;i++)
        {
            arr[i] = sc.nextInt();
        }
        for(int i=0;i<size;i++)
        {
            sum += arr[i];
        }
        System.out.println("Sum of the array is:"+sum);
    }
}