import java.util.Scanner;

class ArrayMinMax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[50];

        System.out.println("Enter the No of elements: ");
        int size = sc.nextInt();

        System.out.println("Enter the elements in array: ");
        for(int i = 0;i < size ; i++){
            arr[i] = sc.nextInt();
        }

        System.out.print("Array is: ");
        for(int i = 0;i < size;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();  // newline

        //Find maximum and minimum of the array

        int largest = arr[0];
        for(int i = 0; i < size;i++){
            if( arr[i] > largest){
                largest = arr[i];
            }
        }
        System.out.println(largest + " is the largest element in the array");

        int smallest = arr[0];
        for(int i = 0;i < size;i++){
            if(arr[i] < smallest){
                smallest = arr[i];
            }
        }
        System.out.println(smallest + " is the smallest element in the array");
    }
}

