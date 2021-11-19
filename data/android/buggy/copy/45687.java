public void setOrientation(javax.vecmath.Quat4d orientation) {
    this.orientation.set(orientation);
    us.ihmc.robotics.geometry.RotationTools.checkQuaternionNormalized(this.orientation);
}