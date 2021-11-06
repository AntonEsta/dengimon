/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ru.dengimon.dengimon.carrency;

import lombok.AccessLevel;
import lombok.experimental.FieldDefaults;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.EqualsAndHashCode;

/**
 *
 * @author esta
 */
@AllArgsConstructor
@FieldDefaults(level=AccessLevel.PRIVATE)
@Getter
@EqualsAndHashCode
public class CurrencyRate {
    
    final CurrencyUnit currency;
    final int nominal;
    final double amount;

//    public CurrencyRate(CurrencyUnit currencyUnit, int i, double d) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
    
}
