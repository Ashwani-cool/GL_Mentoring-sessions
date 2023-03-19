package sorting;

public class MergeSort {
    public void merge(int[] arr,int beg,int mid,int end){
        int n1 = mid-beg+1;
        int n2 = end-mid;
        int[] left = new int[n1];
        int[] right = new int[n2];
        for(int i =0;i<n1;i++)
        {
            left[i]=arr[beg+i];
        }
        for(int i =0;i<n2;i++)
        {
            right[i]=arr[mid+1+i];
        }
        int i=0,j=0;
        int k=beg;
        while (i<n1 && j<n2){
            if(left[i]<=right[j]){
                arr[k]=left[i];
                i++;
            }
            else{
                arr[k]=right[j];
                j++;
            }
            k++;
        }
        while(i<n1){
            arr[k]=left[i];
            i++;
            k++;
        }
        while(j<n2){
            arr[k]=right[j];
            j++;
            k++;
        }
    }
    public void msort(int[] arr,int beg,int end){
        if(beg<end){
            int mid = beg + (end-beg)/2;
            msort(arr,beg,mid);
            msort(arr,mid+1,end);
            merge(arr,beg,mid,end);
        }
    }

}
