import org.junit.Assert;
import org.junit.Test;
public class getStringTest {
    @Test
    public void testHello(){
        GetString GetString=new GetString();
        Assert.assertEquals("hello",GetString.GetHello());
    }
}
