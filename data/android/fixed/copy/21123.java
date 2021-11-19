public void rotate() {
    if (generated) {
        java.util.ArrayList<Block> tempBlocks = copyBlocks(gamePieceBlocks);
        boolean success = attemptRotate(tempBlocks, false);
        if (success == true) {
            attemptRotate(gamePieceBlocks, true);
        }
    }
}