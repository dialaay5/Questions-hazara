import com.exercise22.RoundZero;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RoundDownTest {
    @Test
    public void test_roundDown() {
        RoundZero.RoundDown(1);
        double expected = 1.0;
        Number actual = RoundZero.RoundDown(1.0);
        Assertions.assertEquals(expected, actual);

    }
}
