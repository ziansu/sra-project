int getStartChunkX() {
    return (posX) < 0 ? (((posX) + 1) / 16) - 1 : (posX) / 16;
}