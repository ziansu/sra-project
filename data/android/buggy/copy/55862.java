@java.lang.Override
public void decode() {
    this.dimension = this.getVarInt();
    this.getVector3f(this.x, this.y, this.z);
    this.respawn = this.getBoolean();
}