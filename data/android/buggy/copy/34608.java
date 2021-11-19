public void add(float r, float g, float b) {
    colors.x += r;
    colors.y += g;
    colors.z += g;
    clamp();
}