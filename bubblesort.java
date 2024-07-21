public class bubblesort {
    public static void main(String[] args) {
        int temp;
        int[] arr = new int[] {5,4,3,2,1};
        for(int i = 0;i<arr.length;i++){
            for (int j = 0; j < arr.length; j++) {
                if(arr[j+ 1]>arr[j]){
                    temp = arr[j];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                }
            }

        }
        for (int i = 0; i < arr.length; i++) {
           System.out.println(arr[i]);
            
        }




    }
    
}
