class Solution {
    public int closestTarget(String[] words, String target, int startIndex) {
        int left=0;
        int right=0;
        int n=words.length;
        int i=startIndex;
        while(right<n){
            if(target.equals(words[i])){
                break;
            }
            right++;
            i=(i+1)%n;
        }
        i=startIndex;
        while(left<n){
            if(target.equals(words[i])){
                break;
            }
            left++;
            i=(i-1+n)%n;
        }
    if(right==n && left==n){
        return -1;
    }
    return Math.min(left, right);
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        int n = sc.nextInt();
        sc.nextLine();

        String[] words = new String[n];
        for (int i = 0; i < n; i++) {
            words[i] = sc.nextLine();
        }

        String target = sc.nextLine();
        int startIndex = sc.nextInt();

        Solution obj = new Solution();
        int result = obj.closestTarget(words, target, startIndex);

        System.out.println(result);
    }
}