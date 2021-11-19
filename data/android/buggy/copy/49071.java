public static org.bukkit.block.BlockFace getRight(org.bukkit.block.BlockFace face) {
    com.google.common.base.Preconditions.checkArgument(com.supaham.commons.bukkit.utils.BlockFaceUtils.isHorizontal(face), "block face must be horizontal.");
    return org.bukkit.block.BlockFace.values()[((face.ordinal()) + (1 % 4))];
}