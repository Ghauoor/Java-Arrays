package Questions_Arrays;

// https://leetcode.com/problems/angle-between-hands-of-a-clock/description/
public class Angle_Between_Hands_Of_Clock {
    public double angleClock(int hour, int minutes) {
        // 1 min = 6 degree
        double minuteAngle = minutes * 6.0;
        // 1 hour = 30 degree
        double hourAngle = hour * 30.0;
        if (hour == 12) {
            hourAngle = 0;
        }
        // (5.0 * 60) * minutes == minutes
        double smallNeedleAngle = ((5.0 / 60) * minutes) * 6;
        double minAngle = Math.abs((hourAngle + smallNeedleAngle) - minuteAngle);
        if (minAngle > 180) {
            minAngle = 360 - minAngle;
        }
        return minAngle;
    }
}
