public void jump(float deltaTime) {
    if (isOnGround) {
        setVelocityY(1000.0F);
        isOnGround = false;
    }
}