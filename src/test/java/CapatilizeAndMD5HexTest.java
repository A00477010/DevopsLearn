import com.smu.mscda.CapitalizeAndGenerateMD5Hex;
import org.junit.Assert;
import org.junit.Test;

public class CapatilizeAndMD5HexTest {
    private String input="smu";
    @Test
    public void testCapatalize(){
        Assert.assertEquals("Smu", CapitalizeAndGenerateMD5Hex.capatalize(input));
    }
    @Test
    public void testMD5Hex(){
        Assert.assertEquals("3773300c2f413cc7136f8d74b305519c", CapitalizeAndGenerateMD5Hex.generateMD5Hex(input));
    }
}

