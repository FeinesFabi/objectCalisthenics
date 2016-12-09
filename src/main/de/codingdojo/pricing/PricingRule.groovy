package de.codingdojo.pricing

import de.codingdojo.model.Money

interface PricingRule {

    void addPriceToTotal(int numberOfItems, Money totalAmount)

}