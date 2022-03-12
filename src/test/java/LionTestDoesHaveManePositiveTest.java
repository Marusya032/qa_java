import com.example.Feline;
import com.example.Lion;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class LionTestDoesHaveManePositiveTest {

    private Feline feline;
    private final String sex;
    private final boolean hasMane;

    public LionTestDoesHaveManePositiveTest(String sex, boolean hasMane) {
        this.sex = sex;
        this.hasMane = hasMane;

    }

    @Parameterized.Parameters
    public static Object[][] getParameters() {
        return new Object[][]{
                {"Самка", false},
                {"Самец", true},

        };
    }

    @Test
    public void doesHaveManeReturnsCorrectValuePositiveTest() throws Exception {
        Lion lion = new Lion(sex, feline);
        Boolean actual = lion.doesHaveMane();
        assertEquals(hasMane, actual);

    }
}






