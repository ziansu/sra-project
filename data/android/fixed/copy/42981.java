public void set(float out) {
    if (out != (last)) {
        last = out;
        output.event();
    }
}