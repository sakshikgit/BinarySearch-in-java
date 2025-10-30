

//leetcode 941. valid mountain array

public class Leet941 {
    public static void main(String[] args){

    }
    
}

public boolean validMountainArray(int[] arr){
    int index = 0;
    int n = arr.length-1;
    
    // we are checking increasing part
    while(index <n-1){
        if(arr[index] < arr[index+1]){
            index++;
        }
        else{
            break;
        }
    }

    // ya to array increasing nhi h ya phir pura array only increasing h
    if(index ==0 || index==n-1){
        return false;
    }

     // find all decreasing seq (find the end of the array)
        while(index<n-1){
            if(arr[index]>arr[index+1]){
                index++;
            }else{
                break;
            }
        }
        return (index==n-1);

}
