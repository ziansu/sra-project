public boolean switchButtonHitTest(com.ezardlabs.dethsquare.Touch t) {
    return (switchButton.hitTest(t.startPosition)) && (switchButton.hitTest(t.position));
}