import java.util.Scanner;

public class HelloWorld{

     public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[100];
        
        System.out.println("Enter the no of elements in array: ");
        int size = sc.nextInt();
        
        System.out.println("Enter the elements in array: ");
        for(int i = 0; i < size; i++){
            arr[i] = sc.nextInt();
        }
        
        System.out.print("Array is: ");
        for(int i = 0; i < size; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();  // newline
        
        // Array Insertion
        System.out.println("Enter the element to be inserted: ");
        int element = sc.nextInt();
        
        System.out.println("Enter the position (0 to " + size + "): ");
        int index = sc.nextInt();
        
        if(index < 0 || index > size){
            System.out.println("Invalid insertion position");
        } else {
            // Shift elements to right from 'index'
            for(int i = size; i > index; i--){
                arr[i] = arr[i - 1];
            }
            arr[index] = element;
            size++;
            
            System.out.print("Array after insertion: ");
            for(int i = 0; i < size; i++){
                System.out.print(arr[i] + " ");
            }
            System.out.println();  // newline
            
            // Array deletion
            System.out.println("Enter the position to be deleted (0 to " + (size - 1) + "): ");
            int delIndex = sc.nextInt();
            
            if(delIndex < 0 || delIndex >= size){
                System.out.println("Invalid deletion position");
            } else {
                // Shift elements to left from 'delIndex + 1'
                for(int i = delIndex; i < size - 1; i++){
                    arr[i] = arr[i + 1];
                }
                size--;
                
                System.out.print("Array after deletion: ");
                for(int i = 0; i < size; i++){
                    System.out.print(arr[i] + " ");
                }
                System.out.println();
            }
        }
        sc.close();
     }
}
