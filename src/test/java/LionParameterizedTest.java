import com.example.Feline;
import com.example.Lion;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.mockito.Mockito;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)

public class LionParameterizedTest {
    private final String sex;
    private final int kittensCount;

    public LionParameterizedTest(String sex, int kittensCount) {
        this.sex = sex;
        this.kittensCount = kittensCount;
    }
    @Parameterized.Parameters
    public static Object[][] lionData() {
        return new Object[][] {
                {"Самец", 0}, {"Самка", 1}, {"Самец", 10}
        };
    }

    @Test
    public void checkReturnedNumberOfKittens() throws Exception {
        Feline mockFeline = Mockito.mock(Feline.class);
        Mockito.when(mockFeline.getKittens()).thenReturn(kittensCount);
        Lion lion = new Lion(sex, mockFeline);
        int realKittensCount = lion.getKittens();
        assertEquals(kittensCount ,realKittensCount);
    }
}