package Questions_Arrays;

import java.util.Arrays;

public class Minimum_Rounds_to_Complete_All_Tasks {
    public int minimumRounds(int[] tasks) {
        Arrays.sort(tasks);
        int count = 0;
        int result = 0;

        for (int i = 0; i < tasks.length; i++) {
            //Count all the tasks
            count++;

            if (i == tasks.length - 1 || tasks[i] != tasks[i + 1]) {

                //Means Count Item is 1
                if (count == 1) return -1;

                result += count / 3;

                // we need one more round to process these tasks
                if (count % 3 != 0) result++;

                // Reset the count for the next set of tasks
                count = 0;
            }
        }

        return result;
    }
}
