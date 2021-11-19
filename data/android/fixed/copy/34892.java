@java.lang.Override
protected void controlUpdate(float tpf) {
    spatial.rotate(0, 0, ((speed) * tpf));
}