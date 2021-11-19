@java.lang.Override
public void invalidate() {
    this.tileEntityInvalid = true;
    this.updateContainingBlockInfo();
    this.checkForAdjacentChests();
}