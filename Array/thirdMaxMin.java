import java.util.Scanner;

public class thirdMaxMin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[50];

        System.out.println("Enter the No of elements: ");
        int size = sc.nextInt();

        System.out.println("Enter the elements in array: ");
        for(int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Array is: ");
        for(int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();  // newline

        // Finding third largest and third smallest element
        int largest = arr[0], secondLargest = -1, thirdLargest = -1;
        for(int i = 0; i < size; i++) {
            if(arr[i] > largest) {
                thirdLargest = secondLargest;
                secondLargest = largest;
                largest = arr[i];
            } else if(arr[i] > secondLargest && arr[i] < largest) {
                thirdLargest = secondLargest;
                secondLargest = arr[i];
            } else if(arr[i] > thirdLargest && arr[i] < secondLargest) {
                thirdLargest = arr[i];
            }
        }
        System.out.println(thirdLargest + " is the third largest element in the array");

        int smallest = arr[0], secondSmallest = Integer.MAX_VALUE, thirdSmallest = Integer.MAX_VALUE;
        for(int i = 0; i < size; i++) {
            if(arr[i] < smallest) {
                thirdSmallest = secondSmallest;
                secondSmallest = smallest;
                smallest = arr[i];
            } else if(arr[i] < secondSmallest && arr[i] > smallest) {
                thirdSmallest = secondSmallest;
                secondSmallest = arr[i];
            } else if(arr[i] < thirdSmallest && arr[i] > secondSmallest) {
                thirdSmallest = arr[i];
            }
        }
        System.out.println(thirdSmallest + " is the third smallest element in the array");
    }
}
