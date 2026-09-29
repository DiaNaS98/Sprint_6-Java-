import com.example.Cat;
import com.example.Feline;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)

public class CatTests {

    @Mock
    private Feline mockFeline;

    @Test
    public void returnsCorrectSoundTest() {
        Cat cat = new Cat(mockFeline);
        String sound = "Мяу";
        String actualSound = cat.getSound();
        assertEquals(sound, actualSound);
    }

    @Test
    public void returnCorrectFoodListTest() throws Exception {
        Cat cat = new Cat(mockFeline);
        List<String> foodList = List.of("Волк", "Лиса");
        Mockito.when(mockFeline.eatMeat()).thenReturn(foodList);
        List<String> actualFoodList = cat.getFood();
        assertEquals(foodList, actualFoodList);
    }

}