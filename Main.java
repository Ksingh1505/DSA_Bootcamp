class Solution{
    public int floor_sqrt(int n){
        int i=1;
        while(i*i <= n){
            i++;
        }
        return i-1;
    }
}
public class Main {
    public static void main(String[] args) {
        int n=27;
        Solution sol = new Solution();
        System.out.println(sol.floor_sqrt(n));
    }
}
