public int getIncrementAmount() {
    return ((int) (java.lang.Math.round(((((start) - (end)) * (tileSize)) / (GameManager.ANIM_STEPS)))));
}