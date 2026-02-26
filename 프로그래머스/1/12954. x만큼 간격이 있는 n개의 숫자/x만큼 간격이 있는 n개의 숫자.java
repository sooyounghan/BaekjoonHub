class Solution {
    public long[] solution(int x, int n) {
        long[] answer = new long[n];
        answer[0] = (long) x;
        
        for(int i = 1; i < answer.length; i++) {
            answer[i] = answer[0] + (i * answer[0]);
        }
        
        return answer;
    }
}