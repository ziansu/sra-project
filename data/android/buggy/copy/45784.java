public void onRelease(com.mygdx.game.HitState hitFlag) {
    if (!(isHeld)) {
        onHit(hitFlag);
    }
    BeatMap.keyHeld[index] = false;
    isHit = true;
}