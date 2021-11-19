@java.lang.Override
public void damageArmor(net.minecraft.entity.EntityLivingBase entity, net.minecraft.item.ItemStack stack, net.minecraft.util.DamageSource source, int damage, int slot) {
    if (((stack.getTagCompound()) != null) && (stack.getTagCompound().hasKey(NBT.AMOUNT))) {
    }
}