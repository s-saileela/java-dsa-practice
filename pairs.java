public class pairs {
    public static void pairssubarray(int arr[])
    {
        int i;
        int j;
        for(i=0;i<arr.length;i++)
        {
            for(j=i+1;j<arr.length;j++)
            {
                System.out.print("("+ arr[i]+","+arr[j]+")");
            }

        }
    }
    public static void main(String args[])
    {
        int arr[]={2,4,6,8,10};
        pairssubarray(arr);
    }
}
