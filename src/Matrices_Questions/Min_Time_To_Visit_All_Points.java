package Matrices_Questions;

// https://leetcode.com/problems/minimum-time-visiting-all-points/description/
public class Min_Time_To_Visit_All_Points {
    public int minTimeToVisitAllPoints(int[][] points) {
        int ans = 0;
        for (int i = 1; i < points.length; ++i) {
            int[] cur = points[i], prev = points[i - 1];
            ans += Math.max(Math.abs(cur[0] - prev[0]), Math.abs(cur[1] - prev[1]));
        }
        return ans;
    }

}
