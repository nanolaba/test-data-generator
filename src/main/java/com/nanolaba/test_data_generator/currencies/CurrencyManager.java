package com.nanolaba.test_data_generator.currencies;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class CurrencyManager {

    public List<Currency> getCurrencies() throws IOException {

        List<Currency> res = new LinkedList<Currency>();

        InputStream in = Thread.currentThread().getContextClassLoader().getResourceAsStream("currencies.txt");
        try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(in, StandardCharsets.UTF_8))) {
            String t;
            while ((t = bufferedReader.readLine()) != null) {
                String[] split = t.split("\t");
                if (split.length > 7) {
                    Currency currency = new Currency(split[1], split[3], split[5], split[6], split[7]);
                    if (!res.contains(currency)) {
                        res.add(currency);
                    }
                }
            }
        }

        res.sort(Comparator.comparing(Currency::getName));

        return res;
    }
}
