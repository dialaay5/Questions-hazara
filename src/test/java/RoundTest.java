import com.exercise22.RoundZero;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RoundTest {
    @Test
    public void test_round() {
        RoundZero.Round(0.4);
        double expected = 0.0;
        Number actual = RoundZero.Round(0.4);
        Assertions.assertEquals(expected, actual);
    }
}
