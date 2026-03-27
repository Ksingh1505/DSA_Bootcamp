//BRUTE FORCE
// class Solution{
//     public int floor_sqrt(int n){
//         int i=1;
//         while(i*i <= n){
//             i++;
//         }
//         return i-1;
//     }
// }


//OPTIMAL
class Solution {
    public int floor_sqrt(int n) {
        int low = 1, high = n;
        int ans = 0;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if ((long) mid * mid <= n) {
                ans = mid;        // possible answer
                low = mid + 1;    // try bigger
            } else {
                high = mid - 1;   // go smaller
            }
        }

        return ans;
    }
}
public class Main {
    public static void main(String[] args) {
        int n=27;
        Solution sol = new Solution();
        System.out.println(sol.floor_sqrt(n));
    }
}
