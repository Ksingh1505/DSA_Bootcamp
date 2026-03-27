public class rotation_count {
    public static int findRotation(int[] arr){
        // int n=arr.length;
        // int minVal=arr[0];
        // int minIndex=0;
        // for(int i=1;i<n;i++){
        //     if(arr[i]<minVal){
        //         minVal=arr[i];
        //         minIndex=i;
        //     }
        // }
        // return minIndex;


        //OPTIMAL
        int low =0;
        int high = arr.length-1;

        while(low<high){
            int mid=low + (high-low)/2;

            if(arr[mid]>arr[high]){
                low = mid + 1;

            }
            else{
                high= mid;
            }
        }
        return low;
    }
    public static void main(String[] args) {
        int[] arr={4,5,6,1,2,3};
        int rotation = findRotation(arr);
        System.out.println("Number of rotations:"+ rotation);
    }
}
