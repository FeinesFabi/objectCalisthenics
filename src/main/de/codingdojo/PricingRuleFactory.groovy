package de.codingdojo

abstract class PricingRuleFactory {

    public static PricingRule createWithDiscount(int price, int discountEachNumberOfItems, int discount){

        return new PricingRule() {
            @Override
            void addPrice(int items, Money totalAmount) {
                totalAmount.add(new Money(items * price))
            }

            @Override
            void substractDiscount(int items, Money totalAmount) {
                Money savings = new Money( ( (items / discountEachNumberOfItems) as int) * discount)
                totalAmount.substract(savings);
            }
        }
    }

    public static PricingRule createWithoutDiscount(int price){

        return new PricingRule() {
            @Override
            void addPrice(int items, Money totalAmount) {
                totalAmount.add(new Money(items * price))
            }

            @Override
            void substractDiscount(int ignore, Money wontTouch) { }
        }
    }

}
