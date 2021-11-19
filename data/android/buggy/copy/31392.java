@java.lang.Override
public net.minecraft.tileentity.TileEntity getGuiMaster() {
    net.minecraft.tileentity.TileEntity master = this.master();
    return master != null ? master : this;
}