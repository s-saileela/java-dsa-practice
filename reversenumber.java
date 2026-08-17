public class reversenumber {
    public static void reverse(int arr[])
    {
        int i;
        int n=arr.length;
        int first=0;
        int last=n-1;
        while(first<last)
        {
            int temp;
            temp=arr[last];
            arr[last]=arr[first];
            arr[first]=temp;
            first++;
            last--;
        }
         for(i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String args[])
    {
        int arr[]={2,4,6,8,10};
        reverse(arr);
    }
}
