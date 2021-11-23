private void onSwipeUp() {
    if ((!(isGoingDown)) && (!(isGoingUp))) {
        isGoingRight = false;
        isGoingLeft = false;
        isGoingDown = false;
        isGoingUp = true;
    }
}