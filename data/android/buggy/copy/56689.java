@java.lang.Override
public void attached() {
    this.audioSource.setPosition(getTransform().getPosition());
    this.audioSource.setUp(Vector3f.UNIT_Y);
    this.audioSource.setVelocity(Vector3f.ZERO);
}