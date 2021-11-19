public void setRedstone(double redstoneIn) {
    redstone = java.lang.Math.min(((int) (java.lang.Math.round(redstoneIn))), 42);
}