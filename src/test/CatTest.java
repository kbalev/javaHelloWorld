
import org.junit.jupiter.api.Test;
import theZoo.Cat;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CatTest {
    @Test
    public void testGetCat(){
        Cat cat = new Cat("Tilly");
        assertEquals("Tilly", cat.getName(), "This is not the cat name.");

    }
}
