import com.exercise22.RoundZero;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RoundUpTest {
    @Test
    public void test_roundUp() {
        RoundZero.RoundUp(2);
        double expected = -1.0;
        Number actual = RoundZero.RoundUp(2);
        Assertions.assertEquals(expected, actual);

    }
}
