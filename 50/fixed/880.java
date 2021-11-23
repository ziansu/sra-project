private void onSwipeLeft() {
    if ((!(isGoingRight)) && (!(isGoingLeft))) {
        isGoingRight = false;
        isGoingLeft = true;
        isGoingDown = false;
        isGoingUp = false;
    }
}