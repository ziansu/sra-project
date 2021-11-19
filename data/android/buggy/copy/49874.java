private java.lang.String getRankName(java.util.UUID uuid) {
    vg.civcraft.mc.namelayer.GroupManager.PlayerType pType = g.getPlayerType(uuid);
    if (pType == null) {
        return null;
    }
    return vg.civcraft.mc.namelayer.gui.MemberViewGUI.getDirectRankName(pType);
}