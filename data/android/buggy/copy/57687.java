public void breakBlock(org.bukkit.block.Block b) {
    if ((b.getType()) != (org.bukkit.Material.GRASS))
        return ;
    
    broken.add(new com.redthirddivision.spleef.utils.BlockContainer(b));
    b.setType(Material.AIR);
    b.breakNaturally();
}