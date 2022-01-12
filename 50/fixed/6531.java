public boolean isBesideClimbableBlock() {
    java.lang.System.out.println(this.dataWatcher.getWatchableObjectByte(16));
    return ((this.dataWatcher.getWatchableObjectByte(16)) & 1) != 0;
}