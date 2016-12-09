package de.lineas.codingdojo

class Checkout {

    private Money totalMoney = new Money(0)
    private PricingRules pricingRules = new PricingRules()

    Money total() {
        return totalMoney
    }

    void scanItem(ItemCode itemCode) {
        pricingRules.itemCodeScanned(itemCode, totalMoney)
    }
}
