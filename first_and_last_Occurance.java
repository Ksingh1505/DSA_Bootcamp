
public class first_and_last_Occurance {

    public static void main(String[] args) {

        int[] nums = {5,7,7,8,8,10};
        int target = 8;

        int first = -1;
        int last = -1;

        int left = 0;
        int right = nums.length - 1;

        // First Position
        while(left <= right){
            int mid = left + (right - left)/2;

            if(nums[mid] == target){
                first = mid;
                right = mid - 1;
            }
            else if(nums[mid] < target){
                left = mid + 1;
            }
            else{
                right = mid - 1;
            }
        }

        left = 0;
        right = nums.length - 1;

        // Last Position
        while(left <= right){
            int mid = left + (right - left)/2;

            if(nums[mid] == target){
                last = mid;
                left = mid + 1;
            }
            else if(nums[mid] < target){
                left = mid + 1;
            }
            else{
                right = mid - 1;
            }
        }

        System.out.println(first + " " + last);
    }
}

