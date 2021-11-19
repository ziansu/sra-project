private boolean belongTo(com.github.aedge90.nmm.GameBoardPosition p1, com.github.aedge90.nmm.GameBoardPosition p2, com.github.aedge90.nmm.Options.Color player, boolean partial) {
    if (partial) {
        return oneBelongsToPlayerOtherToNobody(p1, p2, player);
    }else {
        return bothBelongTo(p1, p2, player);
    }
}