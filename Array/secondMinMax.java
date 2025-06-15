import java.util.Scanner;
public class secondMinMax {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[50];

        System.out.println("Enter the No of elements: ");
        int size = sc.nextInt();
        
        System.out.println("Enter the elements in array: ");
        for(int i = 0;i < size;i++){
            arr[i] = sc.nextInt();
        }
        
        System.out.print("Array is: ");
        for(int i = 0;i < size;i++){
            System.out.print(arr[i] + " ");
        }

        //finding second largest and second smallest element

        int largest = arr[0];
        int secondLargest = -1;

        for(int i = 0;i< size;i++){
            if(arr[i] > largest){
                secondLargest = largest;
                largest = arr[i];
            }else if( arr[i] < largest && arr[i] > secondLargest){
                secondLargest = arr[i];
            }
        }
        System.out.println("\n" + secondLargest + " is the second largest element in the array");

        int smallest = arr[0];
        int secondSmallest = Integer.MAX_VALUE;
        for(int i =0; i < size;i++){
            if(smallest < arr[i]){
                secondSmallest = smallest;
                smallest = arr[i];
            }else if(arr[i] < secondSmallest && arr[i] != smallest){
                secondSmallest = arr[i];
            }
        }
        System.out.println(secondSmallest + " is the second smallest element in the array");
    }
}
