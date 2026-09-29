import com.example.Feline;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class FelineParamsTest {

    private final int kittensCount;

    public FelineParamsTest(int kittensCount) {
        this.kittensCount = kittensCount;
    }

    @Parameterized.Parameters
    public static Object[][] felineData() {
        return new Object[][] {
                {0}, {1}, {10}
        };
    }

    @Test
    public void checkReturnedNumberOfKittens() {
        Feline feline = new Feline();
        int realKittensCount = feline.getKittens(kittensCount);
        assertEquals(feline.getKittens(kittensCount) ,realKittensCount);
    }
}
