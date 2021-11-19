public static float getPreciseMarioYPos(final float[] marioPos) {
    return (java.lang.Math.round(marioPos[1])) / (MarioAI.MarioMethods.BLOCK_PIXEL_SIZE);
}