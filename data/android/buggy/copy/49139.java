@java.lang.Override
public int getSizeInventory() {
    return ((this.mainInventory.size()) + (this.armorInventory.size())) + (this.offHandInventory.size());
}