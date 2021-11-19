@java.lang.Override
public void dispose() {
    this.shader.dispose();
    this.mesh.dispose();
    this.frameBuffer.dispose();
}