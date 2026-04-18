import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        Solution obj = new Solution();
        System.out.println(obj.mirrorDistance(n));
    }
}

class Solution {
    public int mirrorDistance(int n) {
        int rev = 0;
        int temp = n;

        while (n != 0) {
            rev = (rev * 10) + (n % 10);
            n = n / 10;
        }

        int diff = Math.abs(temp - rev);
        return diff;
    }
}