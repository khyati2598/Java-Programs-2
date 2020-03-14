import java.util.Scanner;

public class BinarySearch
{
    public static int binarySearch(int[] arr,int num)
    {
        int start = 0;
        int end = arr.length -1;
        while(start <=end)
        {
            int mid = (start+end)/2;
            if(num == arr[mid]){
            return mid;
            }else if(num > arr[mid]){
               start = mid+1;
            }else{
                end = mid-1;
            }
        }
        return -1;
    }
    public static int[] takeInput()
    {
        Scanner s = new Scanner(System.in);
        int size = s.nextInt();
        int a[] = new int[size];
        for(int i=0;i<size;i++)
        {
            a[i]=s.nextInt();
        }
        return a;
    }
  public static void main(String[] args) {
        int arr[] = takeInput();
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        binarySearch(arr, num);

    }
}