public class trappingrainwater {
    public static void trapping(int arr[])
    {
        int n=arr.length;
        int leftmax[]=new int[n];
        //for leftmax
        leftmax[0]=arr[0];
        for(int i=1;i<n;i++)
        {
            leftmax[i]=Math.max(leftmax[i-1],arr[i]);
        }
        System.out.println("Leftmax Values:");
        for(int i=0;i<n;i++)
        {
            System.out.println(leftmax[i]+" ");
        }
        //for finiding rightmax 
        int rightmax[]=new int[n];
        rightmax[n-1]=arr[n-1];
        for(int i=n-2;i>=0;i--)
        {
            rightmax[i]=Math.max(rightmax[i+1],arr[i]);
        }
        System.out.println("Rightmax values:");
        for(int i=0;i<n;i++)
        {
            System.out.println(rightmax[i]+" ");
        }
        //for finding trapped water 
        int trappedwater;
        int waterlevel;
         trappedwater=0;
        for(int i=0;i<n;i++)
        {
            waterlevel=Math.min(leftmax[i],rightmax[i]);
            trappedwater=trappedwater+waterlevel-arr[i];
        }
        System.out.println(trappedwater);
    }

    public static void main(String args[])
    {
        int arr[]={4,2,0,6,5,3};
        trapping(arr);
    }
}
