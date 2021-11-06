/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ru.dengimon.dengimon;

import java.util.Map;
import java.util.HashMap;
import ru.dengimon.dengimon.carrency.CurrencyUnit;
import ru.dengimon.dengimon.carrency.CurrencyRate;

/**
 *
 * @author esta
 */
public class Currencies {
    
    public static Map<String, CurrencyRate> getCurrencyRates() {
        Map<String, CurrencyRate> map = new HashMap<>();
        map.put("R01010", new CurrencyRate(new CurrencyUnit(036,"AUD","Австралийский доллар"), 1, 16.02));
        map.put("R01035", new CurrencyRate(new CurrencyUnit(826,"GBP","Фунт стерлингов Соединенного королевства"), 1, 43.82));
        map.put("R01090", new CurrencyRate(new CurrencyUnit(974,"BYR","Белорусских рублей"), 1000, 18.42));
        map.put("R01215", new CurrencyRate(new CurrencyUnit(208,"DKK","Датских крон"), 10, 36.10));
        return map;
    }
    
}
