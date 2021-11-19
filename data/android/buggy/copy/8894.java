org.jtrfp.trcl.obj.PortalExit getTunnelEntrancePortal(java.awt.Point mapSquareXZ) {
    return tunnelPortals.get(pointToHash(mapSquareXZ));
}