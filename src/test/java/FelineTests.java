import com.example.Feline;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class FelineTests {


    @Test
    public void ifAnimalEatsMeatTest() throws Exception {
        Feline feline = new Feline();
        List<String> listOfFoods = feline.getFood("Хищник");
        List<String> actualFoodsList = feline.eatMeat();
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