import com.example.Feline;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.mockito.Spy;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class FelineTests {

    @Spy
    private Feline spyFeline;

    @Test
    public void ifAnimalEatsMeatTest() throws Exception {
        List<String> listOfFoods = List.of("Зебра", "Бегемот", "Жираф");
        Mockito.when(spyFeline.getFood("Хищник")).thenReturn(listOfFoods);
        List<String> actualFoodsList = spyFeline.eatMeat();
        assertEquals(listOfFoods, actualFoodsList);
    }

    @Test
    public void returnCorrectFamilyTest() {
        Feline feline = new Feline();
        String family = "Кошачьи";
        String actualFamily = feline.getFamily();
        assertEquals(family, actualFamily);
    }

    @Test
    public void returnCorrectNumberOfKittens() {
        Feline feline = new Feline();
        int kittensCount = 1;
        int actualKittensCount = feline.getKittens();
        assertEquals(kittensCount, actualKittensCount);
    }

}