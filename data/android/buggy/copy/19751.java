private static void registerItemModel(net.minecraft.item.Item item) {
    net.minecraft.util.ResourceLocation resourceLocation = ((net.minecraft.util.ResourceLocation) (Item.itemRegistry.getNameForObject(item)));
    com.cricketcraft.chisel.client.ModelsChisel.registerItemModel(item, 0, resourceLocation.getResourcePath());
}