package tudelft.mirror;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MirrorTest {

    @Test
    public void evenLength()
    {
        String result = new Mirror().mirrorEnds("abXYba");
        Assertions.assertEquals("ab", result);
    }

    @Test
    public void oddLength()
    {
        String result = new Mirror().mirrorEnds("abXYZba");
        Assertions.assertEquals("ab", result);
    }

    @Test
    public void EvenPalindrome()
    {
        String result = new Mirror().mirrorEnds("abFggFba");
        Assertions.assertEquals("ab", result);
    }


    @Test
    public void oddPalindrome()
    {
        String result = new Mirror().mirrorEnds("xyOyx");
        Assertions.assertEquals("xy", result);
    }


}
