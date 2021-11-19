private void stopFalling() {
    if ((isJumping()) || (isFalling())) {
        state = com.thesullies.characters.Stickman.STICKMAN_STATES.IDLE;
    }
}