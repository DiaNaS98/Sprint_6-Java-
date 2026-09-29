import com.example.Feline;
import com.example.Lion;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class LionTests {

    @Mock
    private Feline mockFeline;

    @Test
    public void returnCorrectFoodListForMaleTest() throws Exception {
        Lion lion = new Lion("Самец", mockFeline);
        List<String> foodList = List.of("Рыба", "Птица");
        Mockito.when(mockFeline.getFood("Хищник")).thenReturn(foodList);
        List<String> actualFoodList = lion.getFood();
        assertEquals(foodList, actualFoodList);
    }

    @Test
    public void returnCorrectFoodListForFemaleTest() throws Exception {
        Lion lion = new Lion("Самка", mockFeline);
        List<String> foodList = List.of("Крокодил", "Кайот", "Рысь");
        Mockito.when(mockFeline.getFood("Хищник")).thenReturn(foodList);
        List<String> actualFoodList = lion.getFood();
        assertEquals(foodList, actualFoodList);
    }

    @Test
    public void errorWhenSexIsIncorrectTest() {
        try { Lion lion = new Lion("Неведома зверушка", mockFeline); }
        catch(Exception exception) {
            System.out.println("Используйте допустимые значения пола животного - самей или самка");
        }
    }

}
