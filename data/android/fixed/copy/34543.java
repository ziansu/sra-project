public void pollMouse(java.nio.IntBuffer coord_buffer, java.nio.ByteBuffer buttons) {
    mouse.poll(coord_buffer, buttons, this);
}