public class BinarySearch {
    public int Binarysearch(int arr[],int target){
        int l=0;
        int r=arr.length-1;
        while(l<=r){
            int mid=l+(r-l)/2;
            if(arr[mid]==target){
                return mid;
            }else if(arr[mid]<target){
                l=mid+1;
            }else{
                r=mid-1;
            }
        }
        return -1;
    }
    public static void main(String []args){
        int arr[]={12,34,56,78,90};
        int target=78;
        BinarySearch bs=new BinarySearch();
        int res= bs.Binarysearch(arr,target);
        if(res!=-1){
            System.out.println("target is found at index: " + res);
        }else{
            System.out.println("target is not found");
        }
    }
}
