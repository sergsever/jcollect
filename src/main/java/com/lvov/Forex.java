package com.lvov;

import javafx.util.Pair;
import com.lvov.Currency;

import java.math.BigInteger;
import java.util.*;

public class Forex {
    protected Map<Pair<Currency, Currency>, BigInteger> currencies;

    public Forex()
    {
        currencies = new HashMap<Pair<Currency, Currency>, BigInteger>();
    }


    public void update(Pair<Currency, Currency> pair, BigInteger rate, Date utime) throws Exception
    {
        if (currencies.containsKey(pair))
        {
            currencies.replace(pair, rate);
        }
        else
        {
            throw  new Exception("Pair not found");
        }
    }

    public void addPair(Pair<Currency, Currency> pair, BigInteger rate) throws Exception
    {
        if (currencies.containsKey(pair)) {
            throw new Exception("Pair Already Exists");
        }
        else {
            currencies.put(pair, rate);
        }
        }

        public int count()
        {
            return currencies.size();
        }
    }



