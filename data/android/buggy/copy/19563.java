@java.lang.Override
public void addRecipe() {
    net.minecraftforge.fml.common.registry.GameRegistry.addRecipe(new net.minecraft.item.ItemStack(this, 8), " dr", " bd", "b  ", 'b', Items.BLAZE_ROD, 'd', Items.DIAMOND, 'r', Blocks.LAPIS_BLOCK);
}