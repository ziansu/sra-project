@net.minecraftforge.fml.relauncher.SideOnly(value = net.minecraftforge.fml.relauncher.Side.CLIENT)
public static void initModels() {
    net.blay09.mods.cookingforblockheads.item.ModItems.recipeBook.registerModels(net.minecraft.client.Minecraft.getMinecraft().getRenderItem().getItemModelMesher());
}