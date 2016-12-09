package de.codingdojo

class PricingRules {

    private Map<ItemCode, Money> pricingRules = new HashMap<>()

    public PricingRules() {
        pricingRules.put(new ItemCode("A"), new Money(12))
        pricingRules.put(new ItemCode("B"), new Money(8))
    }

    Money get(ItemCode itemCode) {
        pricingRules.get(itemCode)
    }

    void itemCodeScanned(ItemCode itemCode, Money totalMoney) {
        Money itemPrice = pricingRules.get(itemCode)
        totalMoney.add(itemPrice)
    }
}
