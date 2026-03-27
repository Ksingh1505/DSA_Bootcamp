public class lc34 {
    public static void main(String[] args) {
        int[] arr={5,7,7,8,8,10};
         
        int n=arr.length;
       
        int fe =-1;
        int le=-1;
        for(int i=0;i<n;i++){
            if(arr[i]==target){
                fe=i;
                //res[0]=i
                break;
            }
        }
         for(int i=n-1;i>=0;i--){
            if(arr[i]==target){
                le=i;
                //res[1]=i
                break;
            }
        }
        return new int[]{fe,le};
    }
}
