package rotate;

public class Rotation {
    public int[] leftRotateByMid(int[] arr,int size){
        int mid = size/2;
        int[] res = new int[size];
        int j=0;
        for(int i=mid;i<size;i++)
        {
            res[j] = arr[i];
            j++;
        }
        for(int i=0;i<mid;i++)
        {
            res[j] = arr[i];
            j++;
        }
        return res;
    }
}


