package de.codingdojo.model

class ItemCode {

    String code

    ItemCode(String code) {
        this.code = code
    }

    @Override
    boolean equals(Object object) {
        if (object && object instanceof  ItemCode) {
            ItemCode otherItemCode = (ItemCode) object
            return otherItemCode.code.equals(code)
        }
        return false
    }

    @Override
    int hashCode() {
        return code.hashCode()
    }

    @Override
    String toString() {
        return String.format("ItemCode [code: %s]", code)
    }
}
