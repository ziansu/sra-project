private boolean isUsableBlock(org.bukkit.block.Block b) {
    org.bukkit.Material m = b.getType();
    for (org.bukkit.Material mat : usables)
        if (mat.equals(m))
            return true;
        
    
    return false;
}