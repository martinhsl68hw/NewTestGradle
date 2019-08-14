import org.junit.Assert;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;


public class MyTest {
    @Test
    public void name() throws Exception {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        MainC.print(new PrintStream(out));
        String s = out.toString();

        Assert.assertEquals("Hello, World!", s);
    }
    @Test
    public void numFunctionTests() throws Exception {
        MainC p=new MainC();
        for (int i=0;i<5;i++){
            int res=i*i*i;
            Assert.assertEquals(p.getNcubed(i),res);
        }
    }
}
