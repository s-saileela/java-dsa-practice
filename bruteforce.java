public class bruteforce
{
    public static void bruteforcemethod(int arr[])
    {
        int n=arr.length;
        int i,j,k;
        int start;
        int end;
        int sum=0;
        int min=Integer.MIN_VALUE;
        for(i=0;i<n;i++)
        {
            start=i;
            for(j=i;j<n;j++)
            {
                end=j;
                sum=0;
                for(k=start;k<=end;k++)
                {
                    sum=sum+arr[k];
                }
            }
             if(min<sum)
            {
                min=sum;
            }
        }
         System.out.println("The maximum value is:"+min);
        }
    public static void main(String args[])
    {
        int arr[]={2,4,6,8};
        bruteforcemethod(arr);
    }
}