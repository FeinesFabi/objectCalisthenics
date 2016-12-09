package de.codingdojo

import de.codingdojo.model.ItemCode
import de.codingdojo.model.Money
import de.codingdojo.pricing.PricingRule

import java.util.concurrent.atomic.AtomicInteger

class ItemCounter {

    Map<ItemCode, AtomicInteger> itemsCounted = new HashMap<>()

    public addItemToCart(ItemCode itemCode) {
        AtomicInteger itemCount =
            itemsCounted.computeIfAbsent(itemCode,{ k -> new AtomicInteger(0)})

        itemsCounted.put(itemCode, new AtomicInteger(itemCount.incrementAndGet()))
    }

    void itemsAreCheckedOut(Map<ItemCode, PricingRule> products, Money total) {
        itemsCounted.each { ItemCode itemCode, AtomicInteger amount ->
            PricingRule pricingRule = products.get(itemCode)

            pricingRule.addPriceToTotal(amount.get(), total)

        }
    }


}
