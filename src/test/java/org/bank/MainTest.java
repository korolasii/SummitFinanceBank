package org.bank;

import org.junit.Test;

import static org.junit.Assert.*;
import org.bank.back.*;

public class MainTest {

    @Test
    public void main() {
        Balance balances = new Balance();
        String name = "Alex";
        int expected = 0;
        int result = balances.getBalance(name);
        assertEquals(expected, result);

        Map<String, Integer> resultMap = WorkWithJSON.loadBalanceFromJson();
        assertTrue(!resultMap.isEmpty());
        assertEquals(Optional.ofNullable(expected), Optional.ofNullable(resultMap.get(name)));


    }
}
