public class smallestelement {
    public static void smaller(int arr[])
    {
        int i;
        int max=Integer.MAX_VALUE;
        for(i=0;i<arr.length;i++)
        {
            if(max>arr[i])
            {
                max=arr[i];
            }

        }
        System.out.print("The maximum number is:"+max);
    }
   public static void main(String args[])
   {
    int arr[]={10,12,0,2,5};
    smaller(arr);
   }
}
