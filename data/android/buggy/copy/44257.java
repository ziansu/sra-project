private void setRandomSpeed() {
    int vx = (random.nextInt(3)) - 1;
    int vy = (random.nextInt(3)) - 1;
    entityBody.setVelocity(vx, vy);
}