class Solution {
    public int removeCoveredIntervals(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> a[0] == b[0] ? b[1] - a[1] : a[0] - b[0]);
        
        int left = intervals.length;
        for (int i = 0; i < intervals.length; i++) {
            for (int j = 0; j < intervals.length; j++) {
                if (i == j) continue; 
                if (intervals[j][0] <= intervals[i][0] && intervals[j][1] >= intervals[i][1]) {
                    left--;
                    break;
                }
            }
        }
        return left;
    }
}