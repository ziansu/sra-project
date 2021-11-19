public void revertFrozenBlocks() {
    if (active_types.contains(com.projectkorra.projectkorra.waterbending.ice.PhaseChange.PhaseChangeType.FREEZE)) {
        for (com.projectkorra.projectkorra.util.TempBlock tb : blocks) {
            com.projectkorra.projectkorra.waterbending.ice.PhaseChange.PLAYER_BY_BLOCK.remove(tb);
            tb.revertBlock();
        }
        blocks.clear();
    }
}