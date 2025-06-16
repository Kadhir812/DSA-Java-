public class rotateBy1 {
    public void rotate(int[] arr){
        int n = arr.length;

        if( n <= 1){
            return;
        }

        int last = arr[n - 1];
        for(int i = n - 1; i > 0; i--){
            arr[i] = arr[i - 1];
            
        }
        arr[0] = last;

    }

    public static void main(String[] args){
        int[] arr = {1, 2, 3, 4, 5};
        rotateBy1 rb1 = new rotateBy1();
        rb1.rotate(arr);
        for(int num : arr){
            System.out.print(num + " ");
        }
    }
}
