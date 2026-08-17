public class prefixmax {
    public static void prefix(int arr[])
    {
        int  n=arr.length;
        int pmax[]=new int[n];
        pmax[0]=arr[0];
        for(int i=1;i<n;i++)
        {
            pmax[i]=Math.max(pmax[i-1],arr[i]);
        }
        for(int i=0;i<n;i++)
        {
            System.out.print(pmax[i]+" ");
        }
    }
    public static void main(String args[])
    {
        int arr[]={2,4,66,8,10};
        prefix(arr);
    }
}
