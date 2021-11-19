@java.lang.Override
public boolean isItemValid(net.minecraft.item.ItemStack itemStack) {
    return itemStack.getItem().getUnlocalizedName().equals("item.ingotGold");
}