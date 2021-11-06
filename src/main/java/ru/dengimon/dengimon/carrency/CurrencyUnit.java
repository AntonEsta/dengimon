/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ru.dengimon.dengimon.carrency;

import lombok.AccessLevel;
import lombok.experimental.FieldDefaults;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;

/**
 *
 * @author esta
 */
@FieldDefaults(level = AccessLevel.PRIVATE)
@AllArgsConstructor
@Getter
@EqualsAndHashCode
public class CurrencyUnit {
    
    final int numCode;
    final String charCode;
    final String name;
    
    /*
    <NumCode>036</NumCode>
<CharCode>AUD</CharCode>
<Nominal>1</Nominal>
<Name>Австралийский доллар</Name>
<Value>16,0102</Value>
    */
}
