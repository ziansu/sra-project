@java.lang.Override
@cpw.mods.fml.relauncher.SideOnly(value = cpw.mods.fml.relauncher.Side.CLIENT)
public net.minecraft.util.IIcon getIcon(int side, int meta) {
    return side == meta ? icons[1] : icons[0];
}