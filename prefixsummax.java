public class prefixsummax {
    public static void prefix(int arr[])
    {
        int n=arr.length;
        int p[]=new int[n];
        int pmax[]=new int[n];
        p[0]=arr[0];
        for(int i=1;i<n;i++)
        {
          p[i]=p[i-1]+arr[i];
        }
        for(int i=0;i<n;i++)
        {
            System.out.println(p[i]+" ");
        }
        //prefix maximum sum

        pmax[0]=p[0];
        for(int i=1;i<n;i++)
        {
            pmax[i]=Math.max(pmax[i-1],p[i]);
        }
        for(int i=0;i<n;i++)
        {
            System.out.print(pmax[i]+" ");
        }
    }
    public static void main(String args[])
    {
        int arr[]={2,4,10,5,1};
        prefix(arr);
    }
}
