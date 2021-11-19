public static net.minecraft.item.ItemStack getMuffinDisplay() {
    net.minecraft.item.ItemStack bob = new net.minecraft.item.ItemStack(dmf444.ExtraFood.Common.items.nbt.NBTFoodLoader.getItem("muffin"));
    bob.setTagCompound(((dmf444.ExtraFood.Common.items.nbt.NBTFood) (dmf444.ExtraFood.Common.items.nbt.NBTFoodLoader.getItem("muffin"))).getNBT("Doublechocolate"));
    return bob;
}