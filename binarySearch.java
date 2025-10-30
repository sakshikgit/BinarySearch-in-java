public class binarySearch {
    public static void main(String[] args){

        int arr[] = {2,5,7,11,45,87,90};
        binarysearch(arr, 87);

    }

    static void binarysearch(int arr[], int target){

        int ans = -1;
        int start = 0;
        int end  = arr.length-1;

        while(start <= end)
        {
            int mid = start + (end-start)/2;

            if(arr[mid] == target){
                ans = arr[mid];
                break;
            }
            else if(arr[mid] > target){
                end = mid - 1;
            }
            else{
                start = mid + 1;
            }
        }

        if(ans == -1){
            System.out.println("target not found");
        }
        else{
            System.out.println("target found at index: " +ans );
        }



    }


    
}
