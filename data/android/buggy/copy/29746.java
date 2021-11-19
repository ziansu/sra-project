private net.minecraft.item.ItemStack getRandomLoot(java.util.Random rnd) {
    net.minecraft.item.ItemStack res = null;
    while (res == null)
        net.minecraftforge.common.ChestGenHooks.getOneItem(ChestGenHooks.STRONGHOLD_CORRIDOR, rnd);
    
    return res;
}