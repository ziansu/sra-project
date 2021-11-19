public boolean isSpell(net.minecraft.item.ItemStack spell) {
    if (spell != null) {
        if ((spell.getItem()) instanceof com.raphydaphy.vitality.item.ItemSpell) {
            return true;
        }
    }
    return false;
}