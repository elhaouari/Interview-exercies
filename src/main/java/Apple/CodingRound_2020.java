package Apple;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CodingRound_2020 {

    public static int minTime(List<Integer> processorTime, List<Integer> taskTime) {

        List<Integer> processorTimeMutable = new ArrayList<>(processorTime);
        List<Integer> taskTimeMutable = new ArrayList<>(taskTime);
        Collections.sort(processorTimeMutable);
        Collections.sort(taskTimeMutable, Collections.reverseOrder());

        int ans = 0;
        int curTask = 0;
        for (int proctime : processorTimeMutable) {
            for (int i = 0; i < 4; ++i) {
                int completionTime = taskTimeMutable.get(curTask) + proctime;
                curTask++;
                ans = Math.max(ans, completionTime);
            }
        }
        return ans;

    }

}
