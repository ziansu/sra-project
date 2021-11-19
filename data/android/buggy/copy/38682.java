public tsp_simulator.VPE getNorthEastNeighbor() {
    if ((onTopEdge()) || (onRightEdge()))
        return null;
    else
        return vpa.getVPE(((xPos) - 1), ((yPos) + 1));
    
}