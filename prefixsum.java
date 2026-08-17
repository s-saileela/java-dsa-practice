public class prefixsum {
    public static void prefix(int arr[])
    {
        int n=arr.length;
        int p[]=new int[n];
        p[0]=arr[0];
        for(int i=1;i<n;i++)
        {
            p[i]=p[i-1]+arr[i];
        }
        for(int i=0;i<n;i++)
        {
            System.out.print(p[i]+" ");
        }
    }
public static void main(String args[])
{
    int arr[]={2,4,6,8,10};
    prefix(arr);
}    
}
