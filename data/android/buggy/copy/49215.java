public org.c1.maths.Mat4f set(int x, int y, float val) {
    data[(x + (y * 4))] = val;
    return this;
}