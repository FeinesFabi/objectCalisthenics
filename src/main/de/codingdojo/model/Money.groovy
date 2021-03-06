package de.codingdojo.model

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

    void substract(Money saving) {
        amount -= saving.amount
    }

    @Override
    String toString() {
        return String.format("Money [amount: %d]", amount)
    }

}
