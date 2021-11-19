private int newIdentity() {
    int newIdentity = identity;
    identity += 1;
    if ((identity) >= (1 << 32)) {
        identity = 0;
    }
    return newIdentity;
}