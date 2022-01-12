public boolean canAcceptTraveller(com.elytradev.teckle.common.worldnetwork.WorldNetworkTraveller traveller, net.minecraft.util.EnumFacing from) {
    if (isLoaded()) {
        return getTile().canAcceptTraveller(traveller, from);
    }
    return isLoaded();
}