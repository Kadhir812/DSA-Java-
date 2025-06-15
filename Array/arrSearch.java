class arrSearch {
    static int search(int arr[], int x){
        for(int i = 0; i < arr.length;i++){
            if(arr[i] ==  x){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args){
        int arr[] = {10,34,89,45,23};
        int x = 89;

        int result = search(arr,x);
        if(result == -1){
            System.out.println("Element not found");
        } else {
            System.out.println("Element found at index: " + result);
        }
    }
}
