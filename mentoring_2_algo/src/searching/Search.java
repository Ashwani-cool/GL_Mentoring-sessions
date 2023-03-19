package searching;

public class Search {
    public int binarySearch(int[] arr,int beg,int end,int element){
        if(beg<=end){
            int mid =beg + (end-beg)/2;
            if(arr[mid]==element)
                return mid;
            else if(arr[mid] > element)
                return binarySearch(arr,beg,mid,element);
            else
                return binarySearch(arr,mid+1,end,element);
        }
        return -1;
    }
}
