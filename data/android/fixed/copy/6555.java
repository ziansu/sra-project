public void update(java.util.concurrent.CopyOnWriteArrayList<main.Block> blocks) {
    this.blocks = blocks;
    checkGoldTouch(blocks);
    movePlayer(blocks);
    if (checkIfOutside(blocks))
        resetPosition(blocks);
    
}