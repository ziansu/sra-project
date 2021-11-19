@java.lang.Override
public void decode() {
    this.dimension = this.getVarInt();
    this.respawn = this.getBoolean();
}