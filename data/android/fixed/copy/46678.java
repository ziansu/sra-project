public void moveHorizontal(int val) {
    vx = val;
    if (!(actualFriend.getState().isSinging())) {
        isFacingRight = actualFriend.getState().isFacingRight(((int) (vx)));
    }
}