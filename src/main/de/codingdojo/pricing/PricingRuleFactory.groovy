package de.codingdojo.pricing

import de.codingdojo.model.Money

abstract class PricingRuleFactory {

    public static PricingRule createWithDiscount(int price, int discountEachNumberOfItems, int discount) {
        return [
                addPriceToTotal: { int numberOfItems, Money totalAmount ->
                    totalAmount.add(new Money(numberOfItems * price))
                    Money savings = new Money(((numberOfItems / discountEachNumberOfItems) as int) * discount)
                    totalAmount.substract(savings);
                }
        ] as PricingRule
    }

    public static PricingRule createWithoutDiscount(int price) {
        return [
                addPriceToTotal: { int numberOfItems, Money totalAmount ->
                    totalAmount.add(new Money(numberOfItems * price))
                }
        ] as PricingRule
    }

}
