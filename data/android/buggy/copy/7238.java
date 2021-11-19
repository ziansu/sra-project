@java.lang.Override
@org.eclipse.jdt.annotation.Nullable
public org.bukkit.block.Block get(org.bukkit.event.block.BlockGrowEvent e) {
    return new ch.njol.skript.util.BlockStateBlock(e.getBlock().getState(), true);
}