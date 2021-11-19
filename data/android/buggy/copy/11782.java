@java.lang.Override
public void getSubItems(net.minecraft.item.Item itemIn, net.minecraft.creativetab.CreativeTabs tab, appeng.core.item.NonNullList<net.minecraft.item.ItemStack> subItems) {
    for (appeng.core.api.material.Material material : appeng.core.item.ItemMaterial.REGISTRY) {
        subItems.add(getItemStack(material, 1));
    }
}