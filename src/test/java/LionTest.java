import com.example.Feline;
import com.example.IFeline;
import com.example.Lion;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import java.util.List;
import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class LionTest {

    private final String sex;
    private final boolean typeGender;
    IFeline ifeline;
    public LionTest(String sex, boolean typeGender) {
        this.sex = sex;
        this.typeGender = typeGender;
    }

    @Parameterized.Parameters
    public static Object[][] getParameters() {
        return new Object[][] {
                { "Самка", false},
                { "Самец", true},
                { "Другой", true},
        };
    }

    @Test
    public void doesHaveManeReturnsCorrectValue() throws Exception {

        try {
            Lion lion = new Lion(sex, ifeline);
            boolean actualGenger = lion.doesHaveMane();
            assertEquals(typeGender, actualGenger);
        } catch (Exception thrown)
        {
            assertEquals("Используйте допустимые значения пола животного - самец или самка", thrown.getMessage());
        }
    }

    @Test
    public void getKittensReturnsCorrectValue() throws Exception {
        String sex = "Самка";
        IFeline feline = new Feline();
        Lion lion = new Lion(sex, feline);
        int  kittensCount = 1;
        int actualKittensCount = lion.getKittens();
        assertEquals(kittensCount, actualKittensCount);

    }

    @Test
    public void getFoodReturnsCorrectValue() throws Exception {
        String sex = "Самка";
        List<String> eatLion  = List.of("Животные", "Птицы", "Рыба");
        IFeline feline = new Feline();
        Lion lion = new Lion(sex, feline);
        List<String> actualEatLion = lion.getFood();
        System.out.println(eatLion);
        assertEquals(eatLion, actualEatLion);

    }

}


