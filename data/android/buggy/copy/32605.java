public void move() {
    position.add(com.github.infosimulators.physic.Vector2.scale(acceleration, 0.5F).add(velocity));
    velocity.add(acceleration);
    collider.setOffset(position);
}