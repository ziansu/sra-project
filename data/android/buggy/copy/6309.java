protected void newApple(model.Field oldPosition) {
    this.score += 1;
    this.availableFields.add(oldPosition);
    this.apple = new model.Apple(this);
}