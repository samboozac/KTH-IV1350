package util;

import integration.ItemDTO;

public class ItemIdentifier {
    private String itemIdentifier;

    /**
     *
     * @param itemIdentifier
     */
    public ItemIdentifier(String itemIdentifier) {
        this.itemIdentifier = itemIdentifier;
    }

    public boolean equals(ItemIdentifier itemIdentifier){
        if(this.itemIdentifier.equals(itemIdentifier.getValue())) {
            return true;
        } else {
            return false;
        }
    }

    /**
     *
     * @return
     */
    public String getValue() {
        return itemIdentifier;
    }
}
