public void stand() {
    inAnim();
    posTween = null;
    renderer.startAnimation(standAnim, Tween.Type.SPRITE_DEFINED, (-1), null, null);
    outAnim();
}