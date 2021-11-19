@java.lang.Override
public java.util.Optional<io.github.nucleuspowered.nucleus.api.data.WarpLocation> getWarp(java.lang.String warpName) {
    return store.getWarpLocation(warpName.toLowerCase());
}