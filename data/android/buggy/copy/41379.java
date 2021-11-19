public void set(int x, int y, double val) {
    values.set(x, y, ((byte) ((val * 255) - 128)));
}