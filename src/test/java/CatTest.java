import com.example.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import java.util.List;
import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class CatTest {

    @Mock
    private Feline feline ;

    @Test
    public void getFoodReturnsCorrectValue() throws Exception{
        Cat cat = new Cat(feline);
        List<String> catFood = List.of("Животные", "Птицы", "Рыба");
        Mockito.when(feline.eatMeat()).thenReturn(List.of("Животные", "Птицы", "Рыба"));
        List<String> actualCatFood = cat.getFood();
        assertEquals(catFood, actualCatFood);
    }

    @Test
    public void catSoundReturnsCorrectValue() throws Exception{
        Cat cat = new Cat(feline);
        String sound = "Мяу";
        String actualSound = cat.getSound();
        assertEquals(sound, actualSound);

    }
}
