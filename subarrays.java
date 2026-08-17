public class subarrays {
    public static void subarray(int arr[])
    {
        int i,j,k;
        int start;
        int end;
        for(i=0;i<arr.length;i++)
        {
            start=i;
            for(j=i;j<arr.length;j++)
            {
                end=j;
                for(k=start;k<=end;k++)
                {
                    System.out.print(arr[k]+" ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
    public static void main(String args[])
    {
        int arr[]={2,4,6,8};
        subarray(arr);
    }
}
