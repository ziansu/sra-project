public net.minecraft.item.ItemStack getItem() {
    load(net.minecraft.client.Minecraft.getMinecraft().player);
    return handler.getStackInSlot(0);
}