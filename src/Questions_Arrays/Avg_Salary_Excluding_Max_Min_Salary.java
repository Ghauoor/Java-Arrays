package Questions_Arrays;

import java.util.Arrays;

//https://leetcode.com/problems/average-salary-excluding-the-minimum-and-maximum-salary/description/

// TC: nlogn
public class Avg_Salary_Excluding_Max_Min_Salary {
    public double average(int[] salary) {
        // Sort the salary array in ascending order
        Arrays.sort(salary);

        // Compute the sum of all salaries
        double sum = 0;
        for (int i = 0; i < salary.length; i++) {
            sum = sum + salary[i];
        }

        // Return the average of salaries excluding the minimum and maximum
        // by subtracting the two extreme salaries from the sum and dividing
        // by the count of salaries minus two
        return (sum - (salary[0] + salary[salary.length - 1])) / (salary.length - 2);
    }

    //TC: O(N)
    public double averageSalary(int[] salary) {
        // max_salary is the for finding the max salary in the salary arr
        // min_salary is the for finding the min sakaey in the salary arr
        int min_salary = Integer.MAX_VALUE;
        int max_salary = Integer.MIN_VALUE;
        // salary array length
        int len = salary.length;
        // The result should be in double thats why sum as double
        double sum = 0;

        for (int i : salary) {
            // We compare current salary with our min and max salary,
            // and if its replaceable then we will replace
            min_salary = Math.min(i, min_salary);
            max_salary = Math.max(i, max_salary);

            // We keep adding the salary to get the sum
            sum += i;
        }
        // we subtract the max & min from the sum
        sum = sum - min_salary - max_salary;

        // find average of salary and return
        // len -  2 is because we have to remove min and max salary so minus 2 in salary array length
        return sum / (len - 2);
    }
}
