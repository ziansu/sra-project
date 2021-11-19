public boolean mustLose() {
    return ((((height) > 1) && (isEaten(0, 1))) && ((width) > 1)) && (isEaten(1, 0));
}