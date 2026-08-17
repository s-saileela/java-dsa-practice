public class linearsearch {
    public static int linear(int arr[])
    {
        int i;
        int key=10;
        for(i=0;i<arr.length;i++)
        {
            if(arr[i]==key)
            {
                return i;
            }
        }
        return -1;
    }
    public static void main(String args[])
    {
        int arr[]={2,4,6,10,5,8};
        int answer=linear(arr);
        if(answer==-1)
        {
            System.out.print("The number is not found");
        }
        else{
            System.out.print("The number is found at:"+answer);
        }
    }
}
