public void removeItem(no.opentech.shoppinglist.entities.Item item) {
    if (item.isChecked())
        no.opentech.shoppinglist.utils.Statistics.incrementItemsCheckedOff();
    
    getShoppingListItems().remove(item);
    no.opentech.shoppinglist.utils.Utils.getShoppingListRepository().removeItemFromShoppingList(item, shoppingList);
}