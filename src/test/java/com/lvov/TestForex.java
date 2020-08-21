package com.lvov;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import javafx.util.Pair;


import java.math.BigInteger;
import java.util.Date;

public class TestForex {
    protected void tearDown() throws Exception
    {
        Forex forex = new Forex();
        Currency usd = new Currency("USD");
        Currency eur = new Currency("EUR");
        Pair<Currency, Currency> pair = new Pair<Currency, Currency>(usd, eur);
        forex.update(pair, BigInteger.valueOf(Integer.parseInt("1")), new Date());
    }
    @Test
    public void testAdd() throws Exception {
        Currency usd = new Currency("usd");
        Currency eur = new Currency("eur");
        Forex forex = new Forex();
        forex.addPair(new Pair<Currency, Currency>(usd, eur), BigInteger.valueOf(Integer.parseInt("1")));
        assertEquals(forex.count(), 1 );
    }

}
