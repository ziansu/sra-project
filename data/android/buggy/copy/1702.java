@java.lang.Override
public void getSubItems(net.minecraft.item.Item itemIn, net.minecraft.creativetab.CreativeTabs tab, java.util.List<net.minecraft.item.ItemStack> subItems) {
    super.getSubItems(itemIn, tab, subItems);
    subItems.add(new net.minecraft.item.ItemStack(itemIn, 1, 1));
}