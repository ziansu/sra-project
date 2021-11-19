public org.bukkit.enchantments.Enchantment getEnchantment(java.lang.String name) throws java.lang.Exception {
    org.bukkit.enchantments.Enchantment enchantment = bammerbom.ultimatecore.bukkit.resources.databases.EnchantmentDatabase.getByName(name);
    return enchantment;
}