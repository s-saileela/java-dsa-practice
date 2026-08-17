public class suffixsummax{
    public static void suffix(int arr[])
    {
        int n=arr.length;
        int s[]=new int[n];
        s[n-1]=arr[n-1];
        for(int i=n-2;i>=0;i--)
        {
            s[i]=s[i+1]+arr[i];
        }
        for(int i=0;i<n;i++)
        {
            System.out.println(s[i]+" ");
        }
        //suffix maximum
        int smax[]=new int[n];
        smax[n-1]=s[n-1];
        for(int i=n-2;i>=0;i--)
        {
            smax[i]=Math.max(smax[i+1],s[i]);
        }
        for(int i=0;i<n;i++)
        {
            System.out.print(smax[i]+" ");
        }

    }
    public static void main(String args[])
    {
        int arr[]={4,2,1,5,98};
        suffix(arr);
    }
}
