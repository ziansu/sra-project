private void stopFalling() {
    this.velocity.y = 0;
    if ((isJumping()) || (isFalling())) {
        state = com.thesullies.characters.Stickman.STICKMAN_STATES.IDLE;
    }
}