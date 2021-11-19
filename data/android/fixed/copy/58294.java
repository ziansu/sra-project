com.google.gerrit.extensions.client.Side getStoredSideFromDisplaySide(com.google.gerrit.client.diff.DisplaySide side) {
    if ((side == (DisplaySide.A)) && ((base.isBaseOrAutoMerge()) || (base.isParent()))) {
        return com.google.gerrit.extensions.client.Side.PARENT;
    }
    return com.google.gerrit.extensions.client.Side.REVISION;
}