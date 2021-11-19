public float getVelocityX() {
    if ((facingDirection) == (LivingState.FACING_RIGHT)) {
        return this.velocityX;
    }else {
        return -(this.velocityX);
    }
}