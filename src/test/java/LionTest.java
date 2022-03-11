import com.example.Feline;
import com.example.Lion;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import java.util.List;
import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class LionTest {

    @Mock
    private Feline feline;

    @Test
    public void getKittensReturnsCorrectValue() throws Exception {
        String sex = "Самка";
        Lion lion = new Lion(sex, feline);
        Mockito.when(feline.getKittens()).thenReturn(1);
        int kittensCount = 1;
        int actualKittensCount = lion.getKittens();
        assertEquals(kittensCount, actualKittensCount);

    }

    @Test
    public void getFoodReturnsCorrectValue() throws Exception {
        String sex = "Самка";
        List<String> eatLion = List.of("Животные", "Птицы", "Рыба");
        Mockito.when(feline.getFood("Хищник")).thenReturn(List.of("Животные", "Птицы", "Рыба"));
        Lion lion = new Lion(sex, feline);
        List<String> actualEatLion = lion.getFood();
        System.out.println(eatLion);
        assertEquals(eatLion, actualEatLion);

    }

    @Rule
    public ExpectedException exceptionRule = ExpectedException.none();

    @Test
    public void doesHaveManeReturnsCorrectValueNegativeTest() throws Exception {

    Lion lion = new Lion("Другое", feline);
        exceptionRule.expect(Exception.class);
        exceptionRule.expectMessage("Используйте допустимые значения пола животного - самец или самка");
        lion.doesHaveMane();
    }}








