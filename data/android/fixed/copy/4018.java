public float getEffectiveLuck() {
    net.minecraft.item.ItemStack meshStack = meshSlots.getStackInSlot(0);
    if (meshStack != null) {
        return net.minecraft.enchantment.EnchantmentHelper.getEnchantmentLevel(Enchantments.FORTUNE, meshStack);
    }
    return 0.0F;
}