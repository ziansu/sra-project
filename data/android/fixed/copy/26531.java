@java.lang.Override
public void readFromNBT(net.minecraft.nbt.NBTTagCompound tagCompound) {
    super.readFromNBT(tagCompound);
    this.needsRedstone = tagCompound.getInteger(com.lothrazar.cyclicmagic.component.harvester.NBT_REDST);
    this.size = tagCompound.getInteger(com.lothrazar.cyclicmagic.component.harvester.NBT_SIZE);
    this.renderParticles = tagCompound.getInteger(com.lothrazar.cyclicmagic.component.harvester.NBT_RENDER);
}