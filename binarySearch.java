public class binarySearch {
    public static void main(String[] args){

        int arr[] = {2,5,7,11,45,87,90};
        binarysearch(arr, 87);

        int arr2[] = {90, 88, 87, 56, 36, 22, 1};
        binarySearchDesc(arr, 22);

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


    static void binarySearchDesc(int arr[], int target){
        int ans = -1;
        int start = 0;
        int end = arr.length - 1;

        while(start <= end){
            int mid = start + (end - start)/2;

            if(arr[mid] == target){
                ans = target;
            }
            else if(arr[mid] < target){
                end = mid - 1;
            }
            else{
                start = mid + 1;
            }
        }
        if(ans == -1){
            System.out.println("element not found");
        }
        else{
            System.out.println("element found at index " + ans);
        }
    }


    




}
