public void registerTunnelEntrancePortal(java.awt.Point mapSquareXZ, org.jtrfp.trcl.obj.PortalExit exit) {
    tunnelPortals.put(pointToHash(mapSquareXZ), exit);
}