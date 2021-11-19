public static int getMarioYPos(final float[] marioPos) {
    return ((int) ((marioPos[1]) / (MarioAI.MarioMethods.BLOCK_PIXEL_SIZE)));
}