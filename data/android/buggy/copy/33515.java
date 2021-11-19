@java.lang.Override
public boolean unequipBoots(com.wecanteven.Models.Storage.ItemStorage.BootsEquipableItem item) {
    if ((boots) == item) {
        getOwner().addItem(item);
        boots = null;
        return true;
    }
    return false;
}