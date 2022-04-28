import org.junit.Assert;
import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;


public class watchTest {
    watch w;

    @BeforeEach
    public void init(){
        w = new watch();
    }

    @Test
    public void tc1(){
        String test = "a";
        w.change_state(test);
        Assert.assertEquals("DATE", w.getState1());
    }
    @Test
    public void tc2(){
        String test = "acbbbbbbbbbbabbbbbbbbbbbbbbbbbbbbbbbbab";
        w.change_state(test);
        Assert.assertEquals("0:10", w.displayTime());
        Assert.assertEquals("2000-1-3", w.displayDate());
    }
}
