package de.lineas.codingdojo

import org.junit.Assert
import org.junit.Test

class CheckoutTest {

    @Test
    public void testWhenIScanNothingTotalIsZero() {
        //with
        Money expectedTotal = new Money(0)

        //given
        Checkout checkout = new Checkout()

        //when
        Money actualTotal = checkout.total()

        //then
        Assert.assertEquals(expectedTotal, actualTotal)
    }

    @Test
    public void testWhenIScanItemAThenTotalIsTwelf() {
        //with
        Money expectedTotal = new Money(12)

        //given
        Checkout checkout = new Checkout()
        ItemCode itemCodeA = new ItemCode("A")
        //and
        checkout.scanItem(itemCodeA)

        //when
        Money actualToal = checkout.total()

        //then
        Assert.assertEquals(expectedTotal, actualToal)
    }

    @Test
    public void testWhenIScanItemBThenTotalIsEight() {
        //with
        Money expectedTotal = new Money(8)

        //given
        Checkout checkout = new Checkout()
        ItemCode itemCodeB = new ItemCode("B")
        //and
        checkout.scanItem(itemCodeB)

        //when
        Money actualToal = checkout.total()

        //then
        Assert.assertEquals(expectedTotal, actualToal)
    }

    @Test
    public void testWhenIScanItemAAndItemBThenTotalIsTwenty() {
        //with
        Money expectedTotal = new Money(20)

        //given
        Checkout checkout = new Checkout()
        ItemCode itemCodeA = new ItemCode("A")
        ItemCode itemCodeB = new ItemCode("B")
        //and
        checkout.scanItem(itemCodeB)
        checkout.scanItem(itemCodeA)

        //when
        Money actualToal = checkout.total()

        //then
        Assert.assertEquals(expectedTotal, actualToal)
    }
}
