@java.lang.Override
public boolean canTakeStack(net.minecraft.entity.player.EntityPlayer player) {
    if (!(riskyken.armourersWorkshop.common.config.ConfigHandler.lockDyesOnSkins)) {
        return false;
    }
    return true;
}