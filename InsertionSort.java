import java.util.*;
public class InsertionSort

{
    public static void insertionSort(int[] arr){
        for(int i = 1; i < arr.length; i++){
			
			int j = i - 1;
			int temp = arr[i];
			while(j>= 0 && arr[j] > temp){
				arr[j + 1] = arr[j];
				j--;
			}
			arr[j + 1] = temp;
		}

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
        int  arr[] = takeInput();
        insertionSort(arr);
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i] + " ");
        }
    }
}