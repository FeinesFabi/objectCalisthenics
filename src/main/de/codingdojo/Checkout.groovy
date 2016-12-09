package de.codingdojo

import de.codingdojo.model.ItemCode
import de.codingdojo.model.Money

class Checkout {

    private Store store = new Store()

    Money total() {
        Money totalMoney = new Money(0)
        store.cartIsCheckedOut(totalMoney)
        return totalMoney
    }

    void scanItem(ItemCode itemCode) {
        store.itemCodeScanned(itemCode)
    }
}
