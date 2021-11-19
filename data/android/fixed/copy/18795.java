public void jump(float deltaTime) {
    if (!(tiledCollisionComponent.isTopColliding())) {
        jumpingComponent.jump(deltaTime);
    }
}