public void rotate(float rotation) {
    this.rotation = (this.rotation) + rotation;
    upperLeft = com.tda367.infinityrun.Utils.Utils.rotateVec2(upperLeft, rotation);
    lowerRight = com.tda367.infinityrun.Utils.Utils.rotateVec2(lowerRight, rotation);
}