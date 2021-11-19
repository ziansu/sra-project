private void addEnchantIfNeeded() {
    if ((item.getEnchantmentLevel(au.com.mineauz.peculiaritems.PeculiarEnchantment.getEnchantment())) == 0) {
        item.addUnsafeEnchantment(au.com.mineauz.peculiaritems.PeculiarEnchantment.getEnchantment(), 1);
    }
}