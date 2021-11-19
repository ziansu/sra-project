public void cofh_validate() {
    onRotate();
    if ((worldObj.isRemote) && (hasHAM())) {
        powercrystals.minefactoryreloaded.MineFactoryReloadedClient.addTileToAreaList(this);
    }
}