package de.codingdojo

interface PricingRule {

    void addPrice(int numberOfItems, Money totalAmount )
    void substractDiscount(int numberOfItems, Money totalAmount)

}
