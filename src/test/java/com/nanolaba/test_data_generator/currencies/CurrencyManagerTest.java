package com.nanolaba.test_data_generator.currencies;

import junit.framework.Assert;
import org.junit.Test;

import java.util.List;

public class CurrencyManagerTest {

    @Test
    public void testGetCurrencies() throws Exception {
        CurrencyManager manager = new CurrencyManager();
        List<Currency> list = manager.getCurrencies();

        for (Currency cur : list) {
            printCurrency(cur);
        }

        Assert.assertNotNull(list);
    }

    private void printCurrency(Currency cur) {
        System.out.println(
                cur.getName() + " : " +
                        cur.getSign() + " : " +
                        cur.getIsoName() + " : " +
                        cur.getIsoCode() + " : " +
                        cur.getIsoNumber()
        );
    }


}
