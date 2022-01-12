public static org.bukkit.inventory.ItemStack deserialize(byte[] src) {
    java.lang.System.out.println(src.length);
    return ((org.bukkit.inventory.ItemStack) (com.pizzaguy.serialization.ItemStackSerialization.deserialize(src, 0).getResult()));
}