import com.example.Feline;
import org.junit.Test;
import java.util.List;
import static org.junit.Assert.assertEquals;

public class FelineTest {

    @Test
    public void getFamilyReturnsCorrectValue(){
        String familyType = "Кошачьи";
        Feline feline = new Feline();
        String actualFamilyType = feline.getFamily();
        assertEquals(familyType, actualFamilyType);
    }

    @Test
    public void getKittenCountsReturnsCorrectValue(){
        int kittensCount = 1;
        Feline feline = new Feline();
        int actualKittensCount = feline.getKittens(1);
        assertEquals(kittensCount, actualKittensCount);
    }

    @Test
    public void getKittensReturnsCorrectValue(){
        int kittens = 1;
        Feline feline = new Feline();
        int actualHasKittens = feline.getKittens();
        assertEquals(actualHasKittens, kittens);
    }

    @Test
    public void getEatMeatReturnsCorrectValue() throws Exception{
        List<String>  familyType = List.of("Животные", "Птицы", "Рыба");
        Feline feline = new Feline();
        List<String> actualFamily = feline.eatMeat();
        assertEquals(familyType, actualFamily);
    }
}
