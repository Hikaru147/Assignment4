package theBank;

import org.junit.Test;

import static org.junit.Assert.*;

public class InvestmentAccountTest {
    @Test
    public void withdraw() throws Exception {
        InvestmentAccount theAccount = new InvestmentAccount("ThisIsTooHard", 500, 200, "Craig Smith");

        assertEquals(5000, theAccount.withdraw());
    }

}