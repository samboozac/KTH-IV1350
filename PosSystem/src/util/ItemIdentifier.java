package util;

public class ItemIdentifier {
    private String itemIdentifier;

    /**
     * Item ID, A unique combination that identifies an item, can be any character.
     * May be changed to integer type if e.g EAN-codes are used.
     * @param itemIdentifier
     */
    public ItemIdentifier(String itemIdentifier) {
        this.itemIdentifier = itemIdentifier;
    }

    /**
     * Compare two objects of the type ItemIdentifier.
     * @param itemIdentifier
     * @return
     */
    public boolean equals(ItemIdentifier itemIdentifier){
        if(this.itemIdentifier.equals(itemIdentifier.getValue())) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * Retrieves the ID-value, this case of type String.
     * @return
     */
    public String getValue() {
        return itemIdentifier;
    }

    /**
     * String representation of the ItemIdentifier.
     * @return
     */
    public String toString(){
        return itemIdentifier;
    }
}
