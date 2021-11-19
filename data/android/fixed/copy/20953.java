private boolean isUsableBlock(org.bukkit.block.Block b) {
    if (b == null)
        return false;
    
    org.bukkit.Material m = b.getType();
    for (org.bukkit.Material mat : usables)
        if (mat.equals(m))
            return true;
        
    
    return false;
}