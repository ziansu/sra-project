public boolean shouldUseLastPosInGroup(java.lang.String cause) {
    me.gnat008.perworldinventory.PwiLogger.debug(("IN_GROUP_CLASS:: " + (this.useLastPosInGroup.size())));
    return this.useLastPosInGroup.contains(cause);
}