public class SortedAndRotatedArraySearch {
    public static void main(String args[])
    {
        int arr[]={4,5,6,7,0,1,2};
        int target=0;
        int index=search(arr,target,0,arr.length-1);
        System.out.println("Target found at index : "+index);
    }
    public static int search(int arr[],int target,int si,int ei)
    {
        if(si>ei)
        {
            return -1;
        }
        //kaam
        int mid=(si+ei)/2;

        //case FOUND
        if(arr[mid] ==target)
        {
            return mid;
        }

        //mid on L1
        if(arr[si] <=arr[mid])
        {
            //case a :left
            if(arr[si]<=target && target<=arr[mid])
            {
                return search(arr, target, si, mid-1);
            }
            else{
                //case b:right
                return search(arr, target, mid+1, ei);
            }
        }

        //mid on L2
        else
        {
            //case c :right
            if(arr[mid]<=target && target<=arr[ei])
            {
                return search(arr, target, mid+1, ei);
            }
            else{
                //case d:right
                return search(arr, target, si, mid-1);
            }
        }

    } 
}
