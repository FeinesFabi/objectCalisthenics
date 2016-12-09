package de.codingdojo

class Money {

    int amount
    Money(int amount) {
        this.amount = amount
    }

    @Override
    boolean equals(Object object) {
        if (object && object instanceof Money) {
            Money other = (Money) object
            return other.amount == this.amount
        }
        return false
    }

    void add(Money itemPrice) {
        amount += itemPrice.amount
    }
}
