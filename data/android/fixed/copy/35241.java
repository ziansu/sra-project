public static void registerEnchantments() {
    io.github.anon10w1z.craftPP.enchantments.CppEnchantments.enchantmentNames.stream().filter(io.github.anon10w1z.craftPP.handlers.CppConfigHandler.enchantmentNameToEnable::get).forEach(io.github.anon10w1z.craftPP.enchantments.CppEnchantments::instantiateEnchantment);
}