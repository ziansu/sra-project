@java.lang.Override
boolean giveDamage(net.minecraft.item.ItemStack stack, net.minecraft.entity.player.EntityPlayer player) {
    WayofTime.alchemicalWizardry.api.soulNetwork.SoulNetworkHandler.syphonAndDamageFromNetwork(stack, ((net.minecraft.entity.player.EntityPlayer) (player)), getEnergyUsed());
    return true;
}