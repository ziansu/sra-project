private void animateResetPosition(java.util.List<net.offbeatpioneer.retroengine.core.sprites.AbstractSprite> childs) {
    for (net.offbeatpioneer.retroengine.core.sprites.AbstractSprite child : childs) {
        if (child.hasChildren()) {
            animateResetPosition(child.getChildren());
        }
        child.resetPosition();
    }
}