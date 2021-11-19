@java.lang.Override
public com.elmakers.mine.bukkit.api.block.MaterialAndData getEffectMaterial() {
    if ((!(usesBrush)) || (!(usesBrushEffects)))
        return null;
    
    return (brush) != null ? brush : mage.getBrush();
}