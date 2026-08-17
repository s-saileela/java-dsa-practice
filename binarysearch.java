public class binarysearch {
    public static int binary(int arr[],int key)
    {
        int mid;
        int n=arr.length;
        int start=arr[0];
        int end=n-1;
        while(start<=end)
        {
            mid=(start+end)/2;
            if(arr[mid]==key)
            {
                return mid;
            }
            if(arr[mid]<key)
            {
                start=mid+1;
            }
            else
            {
                end=mid-1;
            }
        }
        return -1;
        
    }
    public static void main(String args[])
    {
        int arr[]={2,4,8,10,12,14};
        int key=14;
        int answer=binary(arr, key);
        if(answer==-1)
        {
            System.out.print("The number is not not found");
        }
        else
        {
            System.out.print("The number is found at:"+answer);
        }
    }
}
