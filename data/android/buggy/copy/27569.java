public static com.google.common.base.Optional<de.craftolution.craftoplugin.utility.MaterialType> getType(final org.bukkit.Material material) {
    de.craftolution.craftoplugin.utility.Check.notNull(material, "The material cannot be null!");
    return com.google.common.base.Optional.fromNullable(de.craftolution.craftoplugin.utility.MaterialType.materialMap.get(material));
}