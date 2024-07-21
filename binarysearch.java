public class binarysearch {
    static int search(int[] arr, int low , int high, int key){
        int mid;
       
        mid = low + (high-low )/2;
            if(arr[mid] == key){
                
                return mid;
            }
            else if(arr[mid] > key){
                return search(arr, low, mid - 1, key);
            }
            else if(arr[mid] < key){
                return search(arr, mid + 1, high, key);
            }
        
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        int z = search(arr,0,arr.length -1,7);
        System.out.println("found at index : " + z);

    }
    
}
