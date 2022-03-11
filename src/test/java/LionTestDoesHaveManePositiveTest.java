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




















//    @Rule
//    public ExpectedException exceptionRule = ExpectedException.none();
//
//    @Test
//    public void doesHaveManeReturnsCorrectValueNegativeTest() throws Exception {
//        exceptionRule.expect(Exception.class);
//        exceptionRule.expectMessage("Используйте допустимые значения пола животного - самец или самка");
//
//
//        Lion lion = new Lion("Другое",  hasMane);
//        boolean actual = lion.doesHaveMane();
//        assertEquals(actual, exceptionRule);
//    }
//}






//       try {
//
//               boolean actualGenger = lion.doesHaveMane();
//
//            assertEquals(hasMane, actualGenger);
//        } catch (Exception thrown) {
//            assertEquals("Используйте допустимые значения пола животного - самец или самка", thrown.getMessage());
//        }





////@RunWith(Parameterized.class)
//public class LionTestParametrized {
//   // @Mock
//    private Feline feline ;
//    private String sex;
//    private boolean hasMane;
//
//    //
////    private final String sex;
////    private final boolean typeGender;
////    Feline feline;
////
////    public LionTest(String sex, boolean typeGender) {
////        this.sex = sex;
////        this.typeGender = typeGender;
////    }
//
////    @Parameterized.Parameters
////    public static Object[][] getParameters() {
////        return new Object[][]{
////                {"Самка", false},
////                {"Самец", true},
////           //     {"Другой", true},
////        };
////    }
//
//
////    @Test
////    public void jhvddd() throws Exception {
////        Lion lion = new Lion(sex, feline);
////        Boolean actual = lion.doesHaveMane();
////        assertEquals(hasMane, actual);
////
////    }
//    @Test
//    public void doesHaveManeReturnsCorrectValue() throws Exception {
//        Lion lion = new Lion(sex, hasMane);
//sex = "Самец";
//hasMane = true;
//
//      try {
//
//      //      Lion lion = new Lion(sex, feline);
//            boolean actualGenger = lion.doesHaveMane();
//
//            assertEquals(hasMane, actualGenger);
//        } catch (Exception thrown) {
//            assertEquals("Используйте допустимые значения пола животного - самец или самка", thrown.getMessage());
//        }
//    }
//
//
//
////    @Test
////    public void doesHaveManeReturnsCorrectValue() throws Exception {
////        Lion lion = new Lion(sex, feline);
////        try {
////
////       //     Lion lion = new Lion(sex, feline);
////            boolean actualGenger = lion.doesHaveMane();
////
////            assertEquals(typeGender, actualGenger);
////        } catch (Exception thrown) {
////            assertEquals("Используйте допустимые значения пола животного - самец или самка", thrown.getMessage());
////        }
////    }
//
//}
//
//
//
