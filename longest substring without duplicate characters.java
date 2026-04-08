class Solution {
    public int lengthOfLongestSubstring(String s) {
        int[]visited=new int[256];
        int start=0;
        int maxlen=0;
        for(int i=0;i<s.length();i++){
            int current=s.charAt(i);
            visited[current]++;
            while(visited[current]>1){
                char left=s.charAt(start);
                visited[left]--;
                start++;
            }
            int length=i-start+1;
            maxlen=Math.max(maxlen,length);
        }
    return maxlen;

    }
}