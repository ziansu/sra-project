org.jtrfp.trcl.obj.PortalExit getTunnelEntrancePortal(java.awt.Point mapSquareXZ) {
    synchronized(tunnelPortals) {
        return tunnelPortals.get(pointToHash(mapSquareXZ));
    }
}