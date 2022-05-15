import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;
public class accountTest{
    @Test
    public void increaseTest(){
        account acc = new account();
        acc.increase_balance(100);
        assertEquals(100, acc.balance);
    }
    @Test
    public void increaseTestnegative(){
        account acc = new account();
        acc.increase_balance(-100);
        assertEquals(0, acc.balance);
    }
    @Test
    public void decreaseZeroTest(){
        account acc = new account();
        acc.decrease_balance(100);
        assertEquals(0, acc.balance);
    }

    @Test
    public void decrease(){
        account acc = new account();
        acc.balance = 1000;
        acc.decrease_balance(200);
        assertEquals(800, acc.balance);
    }

    @Test
    public void decrease_more(){
        account acc = new account();
        acc.balance = 1000;
        acc.decrease_balance(1200);
        assertEquals(1000, acc.balance);
    }
    @Test
    public void decreasenegative(){
        account acc = new account();
        acc.balance = 1000;
        acc.decrease_balance(-200);
        assertEquals(1000, acc.balance);
    }


}

