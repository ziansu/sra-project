private void nextBeltPush(java.util.ArrayList<net.minecraft.entity.Entity> entities) {
    tk.blacky704.bgcraft.tileentity.TileEntityBelt nextBelt = getNextBelt();
    if (nextBelt != null) {
        nextBelt.moveExcludingEntities(entities);
        nextBelt.nextBeltPush(entities);
    }
}