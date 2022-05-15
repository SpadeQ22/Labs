import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

class ATMTest {
    @Test
    public void testDepo(){
        ATM atm = new ATM();
        atm.deposit_amnt(100);
        assertEquals(100, atm.acc.balance);
    }
    @Test
    public void withdrawTest(){
        ATM atm = new ATM();
        atm.acc.balance = 1000;
        atm.withdraw(250);
        assertEquals(750, atm.acc.balance);
    }
}