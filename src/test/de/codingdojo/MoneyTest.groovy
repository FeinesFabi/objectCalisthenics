package de.codingdojo

import de.codingdojo.model.Money
import org.junit.Test

import static org.junit.Assert.assertEquals
import static org.junit.Assert.assertNotEquals

class MoneyTest {

    @Test
    public void testMoney1IsNotEqualToMoney2(){
        //when
        Money money1 = new Money(1)
        Money money2 = new Money(2)

        //then
        assertNotEquals(money1, money2)
    }

    @Test
    public void testMoney1IsEqualToMoney1(){
        //when
        Money money1 = new Money(1)
        Money otherMoney1 = new Money(1)

        //then
        assertEquals(money1, otherMoney1)
    }
}
