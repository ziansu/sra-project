public float getVelocityX() {
    if (((livingState) == (LivingState.MOVING_RIGHT)) || ((facingDirection) == (LivingState.FACING_RIGHT))) {
        return this.velocityX;
    }else {
        return -(this.velocityX);
    }
}