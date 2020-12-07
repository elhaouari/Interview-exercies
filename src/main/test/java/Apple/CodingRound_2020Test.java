package Apple;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class CodingRound_2020Test {

    @Test
    public void minTimeTest1() {
        var actual = CodingRound_2020.minTime(List.of(8,10), List.of(2,2,3,1,8,7,4,5));
        assertEquals(16, actual);
    }
    @Test
    public void minTimeTest2() {
        var actual = CodingRound_2020.minTime(List.of(10,20), List.of(2,3,1,2,5,8,4,3));
        assertEquals(23, actual);
    }

}
