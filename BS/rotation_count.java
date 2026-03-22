public class rotation_count {
    public static int findRotation(int[] arr){
        int n=arr.length;
        int minVal=arr[0];
        int minIndex=0;
        for(int i=1;i<n;i++){
            if(arr[i]<minVal){
                minVal=arr[i];
                minIndex=i;
            }
        }
        return minIndex;
    }
    public static void main(String[] args) {
        int[] arr={4,5,6,7,1,2,3};
        int rotation = findRotation(arr);
        System.out.println("Number of rotations:"+ rotation);
    }
}
