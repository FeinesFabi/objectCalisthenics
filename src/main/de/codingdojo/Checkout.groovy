package de.codingdojo

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
