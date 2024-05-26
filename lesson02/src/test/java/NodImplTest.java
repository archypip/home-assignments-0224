import ru.sberbank.jd.lesson02.NodImpl;
import junit.framework.Assert;
import org.junit.Test;

public class NodImplTest {

    NodImpl nodImpl = new NodImpl();

    @Test
    public void calculateTest(){
        int greatestDivider0 = nodImpl.calculate(5, 0);
        int greatestDivider6 = nodImpl.calculate(18, 48);
        int greatestDivider1 = nodImpl.calculate(13, 27);
        int greatestDivider4 = nodImpl.calculate(140, -96);

        Assert.assertEquals(5, greatestDivider0);
        Assert.assertEquals(6, greatestDivider6);
        Assert.assertEquals(1, greatestDivider1);
        Assert.assertEquals(4, greatestDivider4);
    };
}
