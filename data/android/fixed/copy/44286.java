public boolean isPressed(int i) {
    return pressed.containsKey(i) ? pressed.get(i) : false;
}