public net.pixelstatic.koru.sprites.Layer addShadow() {
    return addShadow(("shadow" + (((int) (((net.pixelstatic.koru.sprites.Layer.atlas.findRegion(region).getRegionWidth()) * 0.9F) / 2.0F)) * 2)));
}