public static boolean isHandled(org.bukkit.map.MapView map) {
    for (org.bukkit.map.MapRenderer renderer : map.getRenderers()) {
        if (renderer instanceof fr.moribus.imageonmap.image.Renderer)
            return true;
        
    }
    return false;
}