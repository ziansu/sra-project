public boolean isEvasive() {
    boolean evasive = (state) == (org.jyre.ZrePeer.State.EVASIVE);
    if (evasive) {
        state = org.jyre.ZrePeer.State.EXPIRING;
    }
    return evasive;
}