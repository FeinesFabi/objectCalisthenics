package de.codingdojo

class Store {

    private Map<ItemCode, PricingRule> products = new HashMap<>()
    private ItemCounter itemCounter = new ItemCounter()


    public Store() {
        def pricingRuleItemA = PricingRuleFactory.createWithDiscount(12,3,8)
        def pricingRuleItemB = PricingRuleFactory.createWithoutDiscount(8)
        def pricingRuleItemC = PricingRuleFactory.createWithDiscount(24, 2, 10)
        def pricingRuleItemD = PricingRuleFactory.createWithoutDiscount(26)

        products.put(new ItemCode("A"), pricingRuleItemA)
        products.put(new ItemCode("B"), pricingRuleItemB)
        products.put(new ItemCode("C"), pricingRuleItemC)
        products.put(new ItemCode("D"), pricingRuleItemD)
    }

    void cartIsCheckedOut(Money totalMoney){
        itemCounter.itemsAreCheckedOut(products, totalMoney)
    }

    void itemCodeScanned(ItemCode itemCode) {
        itemCounter.addItemToCart(itemCode)
    }
}
