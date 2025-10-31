https://leetcode.com/problems/peak-index-in-a-mountain-array/description/

public class Leet852 {
    public static void main(String args[]){
        int[] arr = {0,2,1,0};

        int n = arr.length;
        int start = 0;
        int end = n-1;

        while(start <= end)
        {
            int mid = start + (end - start)/2;

            if(mid != 0 && mid != n-1 && arr[mid]>arr[mid-1] && arr[mid] > arr[mid+1]){
                // return mid;
                System.out.println(mid);
            }
            else if(mid != n-1 && arr[mid] < arr[mid+1]){
                start = mid +1 ;
            }
            else{
                end = mid - 1;
            }

        }
        System.out.println("-1");

    }
    
}
