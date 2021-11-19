boolean teleportBy(project.dos.HexCoord hexCoord) {
    return teleportTo(coord.sum(hexCoord));
}