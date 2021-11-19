@java.lang.Override
public boolean setDestination(net.minecraft.item.ItemStack ticket) {
    return ((this.entityMainTrain) != null) && (this.entityMainTrain.setDestination(ticket));
}