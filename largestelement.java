public class largestelement
{
    public static void larger(int arr[])
    {
        int i;
        int min=Integer.MIN_VALUE;
        for(i=0;i<arr.length;i++)
        {
            if(min<arr[i])
            {
                min=arr[i];
            }
        }
        System.out.print("The minimum value is:"+min);
    }
    public static void main(String args[])
    {
      int arr[]={2,4,10,6,88};
      larger(arr);
    }
}