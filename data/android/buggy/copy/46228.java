@java.lang.Override
public void validate() {
    super.validate();
    if (!(this.worldObj.isRemote))
        micdoodle8.mods.galacticraft.core.tile.TileEntityOxygenSealer.loadedTiles.add(this);
    
}